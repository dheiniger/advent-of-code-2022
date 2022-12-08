(ns day-5.core
  (:require [clojure.string :only [split blank?] :as str]))

(defn read-input []
  (slurp "input.txt"))

(defn find-instructions
  ([]
   (find-instructions (str/split-lines (read-input))))
  ([lines]
   (if (empty? (first lines))
     (rest lines)
     (find-instructions (rest lines)))))

(defn crate-arrangement []
  (let [raw-crate-input (str/split-lines (read-input))]
    (for [line raw-crate-input
          :while (not (empty? line))]
      line)))

(defn get-first-crate [crate-str]
  (let [crate (subs crate-str 0 3)]
    (if-not (str/blank? crate)
      crate)))

(defn get-crates-from-strings
  ([crate-strs]
   (get-crates-from-strings crate-strs []))
  ([crate-strs crates]
   (let [remaining-strs (if (< (count (first crate-strs)) 4)
                          (map #(if-not (= % "") "") crate-strs)
                          (map #(subs % 4) crate-strs))
         crate-stack (map get-first-crate crate-strs)]
     (if (str/blank? (first crate-strs))
       (map #(remove nil? %) crates)
       (get-crates-from-strings remaining-strs (cons crate-stack crates))))))

(defn get-crates []
  (map vec (reverse (get-crates-from-strings (butlast (crate-arrangement))))))

(defn read-instruction [raw-step]
  (map #(Integer/parseInt %) 
                 (filter #(not (empty? %))
                         (-> raw-step
                             str/trim
                             (str/split #" ")))))

(defn read-instructions []
  (let [raw-steps (map #(str/replace %  #"move|from|to" "") (find-instructions))]
    (map read-instruction raw-steps)))

;a
(defn move-stack-9000 [crates [number from to]]
  (let [from-stack (nth crates (dec from))
        to-stack (nth crates (dec to))
        moved-crates (reverse (take number from-stack))]

    (assoc (vec crates) (dec from) (vec (drop number from-stack))
           (dec to) (vec (flatten (conj (list to-stack) moved-crates))))))

;b
(defn move-stack-9001 [crates [number from to]]
  (let [from-stack (nth crates (dec from))
        to-stack (nth crates (dec to))
        moved-crates (take number from-stack)]
    
    (assoc (vec crates) (dec from) (vec (drop number from-stack))
           (dec to) (vec (flatten (conj (list to-stack) moved-crates))))))


(defn sort-stacks-9000
  ([]
   (sort-stacks-9000 (read-instructions) (get-crates)))
  ([instructions crates]
   (if (empty? instructions)
     crates
     (sort-stacks-9000 (rest instructions) (move-stack-9000 crates (first instructions))))))

;b
(defn sort-stacks-9001
  ([]
   (sort-stacks-9001 (read-instructions) (get-crates)))
  ([instructions crates]
   (if (empty? instructions)
     crates
     (sort-stacks-9001 (rest instructions) (move-stack-9001 crates (first instructions))))))
