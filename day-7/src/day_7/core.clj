(ns day-7.core
  (:use [clojure.string :as str :only [split-lines split]]
        [clojure.walk :only [postwalk-replace]]))
(def input (slurp "input.txt"))

(def commands {:cd #"\$ cd"
               :ls #"\$ ls"
               :file #"[0-9]+ .*"
               :dir #"dir .*"})

(defn read-commands []
  (str/split-lines input))

(defn command-matches? [ckey command]
  (if (coll? command)
    false
    (not (nil? (re-find (ckey commands) command)))))

(defn parse-params [command-string]
  (if (some #(command-matches? % command-string) [:dir :ls :cd])
    (last (str/split command-string #" "))
    command-string))

(defn change-directory [commands dir-structure]
  (let [params (parse-params (first commands))
        directory-history (second dir-structure)
        new-dir
        (cond (= ".." params) (into [](butlast directory-history))
              (= "/" params) ["/"]
              :else (conj directory-history params))]          
    (assoc dir-structure 1 new-dir)))

(defn list-directory [commands dir-structure]
  dir-structure)

(defn build-directory [file-tree]
  (filter map? (tree-seq map? #(second (first %)) file-tree)))

(defn navigate-to-folder [[file-tree _] path]
  (for [dir (build-directory file-tree)
        :when(= path (ffirst dir))]
    dir))

(defn get-current-folder [current-dir]
  (let [path (first (keys (first current-dir)))]
    ((first current-dir) path)))

(defn replace-in [dir new-folder file-tree]
  (let [current-dir (first dir)
        path (first (keys current-dir))
        dir-to-replace (assoc-in current-dir [path] new-folder)]
    (postwalk-replace {current-dir dir-to-replace} file-tree)))

(defn add-file [commands [file-tree dir-history]]
  (let [path (apply str dir-history)
        file-to-add (first commands)
        current-dir (navigate-to-folder [file-tree [path]] path)
        current-folder (get-current-folder current-dir)
        new-folder (conj current-folder file-to-add)]
    [(replace-in current-dir new-folder file-tree) dir-history]))

(defn add-directory [commands [file-tree dir-history]]
  (let [path (apply str dir-history)
        current-dir (navigate-to-folder [file-tree [path]] path)
        current-folder(get-current-folder current-dir)
        new-folder (conj current-folder {(str path (parse-params (first commands))) []})]
    [(replace-in current-dir new-folder file-tree) dir-history]))

(defn parse-command [command-string]
  (cond (command-matches? :cd command-string) change-directory
        (command-matches? :ls command-string) list-directory
        (command-matches? :file command-string) add-file
        (command-matches? :dir command-string) add-directory
        :else #(println "Invalid function: "%1 %2)))

(defn evaluate-commands
  ([]
   (evaluate-commands [{"/" []} []] (read-commands)))
  ([dir-structure commands]
   (if (empty? commands)
     dir-structure
     (let [command-string (first commands)
           command-fn (parse-command command-string)]
       (recur (command-fn commands dir-structure) (rest commands))))))

(defn seq-file-tree
  ([]
   (tree-seq map? #(second (first %))(first (evaluate-commands))))
  ([file-tree]
   (let [children #(second (first %))]
     (filter map? (tree-seq map? children (first file-tree))))))

(defn path-matches? [dir path]
  (if-not (coll? dir)
    false
    (= (first (keys dir)) path)))

(defn get-dir
  ([path]
   (get-dir path (evaluate-commands)))
  ([path file-tree]
   (let [contents (first file-tree)
         seq-tree (seq-file-tree file-tree)]
     (filter #(path-matches? % path) seq-tree))))

(defn make-file [file-str]
  (let [[size name] (str/split file-str #" ")]
    {:name name :size (Integer/parseInt size)}))

(defn open-folder
  "given a map representing a directory - dir return its contents"
  [dir]
  (if (map? dir)
    (second (first dir))
    dir))

(defn open-folders [dir]
  (if-not (some map? dir)
    dir
    (let [flattened-dir (map open-folder dir)]
      (recur (flatten flattened-dir)))))
  
(defn make-files [flist]
  (map make-file flist))

(defn path-total
  ([path]
   (path-total path (evaluate-commands)))
  ([path ftree]
   (apply + (map :size (make-files (open-folders (get-dir path ftree)))))))

(defn path-sizes [ftree]
  (let [paths (map ffirst (seq-file-tree ftree))]
    (sort #(compare (second (first %1)) (second (first %2)))
          (map #(->{% (path-total % ftree)}) paths))))

(defn find-small-dirs [ftree]
  (let [path-sizes (path-sizes ftree)]
    (filter #(<= (second (first %))100000) path-sizes)))

;1a
(defn total-small-dirs
  ([]
   (total-small-dirs (evaluate-commands)))
  ([ftree]
   (let [small-dirs (find-small-dirs ftree)]
     (apply + (map #(second (first %)) small-dirs)))))

(defn total-space-used []
  (path-total "/"))

(defn total-free-space []
  (- 70000000 (total-space-used)))

(defn space-required []
  (- 30000000 (total-free-space)))

;1b
(defn smallest-dir-to-delete []
  (let [space-required (space-required)]
    (first (filter #(> (first (nfirst %)) space-required)
            (path-sizes (evaluate-commands))))))
