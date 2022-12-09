(ns day-6.core
  (:use [clojure.set :as set :only [intersection]]))


(def input (slurp "input.txt"))

;a
(defn start-of-packet-marker
  ([]
  (let [[buffer remaining] (split-at 4 input)]
       (start-of-packet-marker buffer remaining 4)))
  ([buffer remaining seq-number]
   (if (or (= (count (set buffer)) 4) (empty? remaining))
     seq-number
     (let [next-char (first remaining)
           new-buffer (conj (vec (drop 1 buffer)) next-char)]
       (start-of-packet-marker new-buffer (rest remaining) (inc seq-number))))))

;b
(defn start-of-message-marker
  ([]
   (let [[buffer remaining] (split-at 14 input)]
     (start-of-message-marker buffer remaining 14)))
  ([buffer remaining seq-number]
   (if (or (= (count (set buffer)) 14) (empty? remaining))
     seq-number
     (let [next-char (first remaining)
           new-buffer (conj (vec (drop 1 buffer)) next-char)]
       (recur new-buffer (rest remaining) (inc seq-number))))))
    
