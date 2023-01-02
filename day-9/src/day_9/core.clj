(ns day-9.core
  (:require [clojure.string :as string :only [split-lines]]))

(def starting-pos [0 0])
(def initial-2-knot-positions (repeat 2 [starting-pos]))
(def initial-10-knot-positions (repeat 10 [starting-pos]))

(defn get-input[]
  (string/split-lines (slurp "input.txt")))

(defn next-move [direction current-pos]
  (let [[x y] current-pos]
  (case direction
      \U [x (inc y)]
      \D [x (dec y)]
      \R [(inc x) y]
      \L [(dec x) y])))

(defn next-knot-directions [knot-pos leading-knot-pos]
  (let [[current-x current-y] knot-pos
        [lead-x lead-y] leading-knot-pos
        x-diff (- lead-x current-x)
        y-diff (- lead-y current-y)]
    (cond->[]
        (pos? x-diff) (conj \R)
        (neg? x-diff) (conj \L)
        (pos? y-diff) (conj \U)
        (neg? y-diff) (conj \D))))

(defn knot-close-enough? [[current-knot-x current-knot-y] [lead-knot-x lead-knot-y]]
  (let [x-diff (- lead-knot-x current-knot-x)
        y-diff (- lead-knot-y current-knot-y)]
    (and (> 2 (Math/abs x-diff))
         (> 2 (Math/abs y-diff)))))

(defn next-knot-position [knot-pos leading-knot-pos]
  (loop [directions (next-knot-directions knot-pos leading-knot-pos)
         next-pos knot-pos]
    (if (empty? directions)
      next-pos
      (recur (rest directions) (next-move (first directions) next-pos)))))

(defn follow-knot [knot-pos leading-knot-pos]
  (if (knot-close-enough? knot-pos leading-knot-pos)
    knot-pos
    (next-knot-position knot-pos leading-knot-pos)))

(defn shift-knots-once [direction knot-histories]
  (let [[head-position-histories & remaining-histories] knot-histories
        current-head-pos (last head-position-histories)
        new-head-knot-pos (next-move direction current-head-pos)]
    (loop [lead-knot-pos new-head-knot-pos
           follower-knot-histories (into [] remaining-histories)
           new-knot-histories (into [] knot-histories)
           i 1]
      (if (empty? (flatten follower-knot-histories))
        (assoc new-knot-histories 0 (conj head-position-histories new-head-knot-pos))
        (let [current-knot-histories (first follower-knot-histories)
              current-knot-position (last current-knot-histories)
              next-knot-position (follow-knot current-knot-position lead-knot-pos)
              next-knot-history (conj current-knot-histories next-knot-position)
              next-knot-histories (assoc new-knot-histories i next-knot-history)]
              
          (recur next-knot-position  (rest follower-knot-histories) next-knot-histories (inc i)))))))

(defn shift-knots
  [direction n knot-histories]
  (loop [direction direction
         n n
         knot-histories knot-histories]
    (if (= 0 n)
      knot-histories
      (recur direction (dec n) (shift-knots-once direction knot-histories)))))

(defn tie-knots
  ([] (tie-knots (get-input) initial-10-knot-positions))
  ([moves knot-histories]
   (loop [moves moves
         knot-histories knot-histories]
    (if (empty? moves)
      knot-histories
      (let [[direction-string num-string] (string/split (first moves) #" ")
            direction (first direction-string)
            num (Integer/parseInt num-string)]
      (recur (rest moves) (shift-knots direction num knot-histories)))))))

(defn count-tail-position
  ([] (count-tail-position (get-input) initial-10-knot-positions))
  ([moves knot-histories]
  (count (set (last (tie-knots moves knot-histories))))))

;a
(time(count-tail-position (get-input) initial-2-knot-positions))
;b
(time (count-tail-position (get-input) initial-10-knot-positions))
