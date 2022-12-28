(ns day-8.core
  (:require [clojure.string :as string :only [split-lines split]]))

(defn read-input []
  (string/split-lines (slurp "input.txt")))

(defn tree-row-str->int [tree-row-str]
  (map #(Integer/parseInt %) tree-row-str))

(defn get-trees
  ([]
   (get-trees (read-input)))
  ([input]
   (let [tree-str-rows (map #(string/split % #"") input)
        tree-rows (map tree-row-str->int tree-str-rows)]
    tree-rows)))

(defn get-north-trees [all-trees tree-index tree-row-num]
  (let [north-tree-rows (take tree-row-num all-trees)]
    (map #(nth % tree-index) north-tree-rows)))

(defn get-south-trees [all-trees tree-index tree-row-num]
  (let [north-tree-rows (drop (inc tree-row-num) all-trees)]
    (map #(nth % tree-index) north-tree-rows)))

(defn get-east-trees [all-trees tree-index tree-row-num]
  (let [tree-row (nth all-trees tree-row-num)]
    (drop (inc tree-index) tree-row)))

(defn get-west-trees [all-trees tree-index tree-row-num]
  (let [tree-row (nth all-trees tree-row-num)]
    (take tree-index tree-row)))

(defn directionally-visible? [adjacent-trees tree]
  (empty? (filter #(>= % tree) adjacent-trees)))

(defn north-visible? [all-trees tree-index tree-row-num]
  (let [tree-row (nth all-trees tree-row-num)
        tree (nth tree-row tree-index)
        north-trees (get-north-trees all-trees tree-index tree-row-num)]
    (directionally-visible? north-trees tree)))

(defn south-visible? [all-trees tree-index tree-row-num]
  (let [tree-row (nth all-trees tree-row-num)
        tree (nth tree-row tree-index)
        south-trees (get-south-trees all-trees tree-index tree-row-num)]
    (directionally-visible? south-trees tree)))

(defn west-visible? [all-trees tree-index tree-row-num]
  (let [tree-row (nth all-trees tree-row-num)
        tree (nth tree-row tree-index)
        west-trees (get-west-trees all-trees tree-index tree-row-num)]
    (directionally-visible? west-trees tree)))

(defn east-visible? [all-trees tree-index tree-row-num]
  (let [tree-row (nth all-trees tree-row-num)
        tree (nth tree-row tree-index)
        east-trees (get-east-trees all-trees tree-index tree-row-num)]
    (directionally-visible? east-trees tree)))

(defn visible? [all-trees tree-index tree-row-num]
  (let [tree-row (nth all-trees tree-row-num)
        tree (nth tree-row tree-index)]
    (or (north-visible? all-trees tree-index tree-row-num)
        (south-visible? all-trees tree-index tree-row-num)
        (east-visible? all-trees tree-index tree-row-num)
        (west-visible? all-trees tree-index tree-row-num))))

;1a
(defn visible-count
  ([]
   (visible-count (get-trees) 0 0 0))
  ([all-trees tree-row-num tree-index visible-count]
   (if (or (= tree-row-num (count all-trees))
           (= tree-index (count (last all-trees))))
     visible-count
     (let [visible-count (if (visible? all-trees tree-index tree-row-num)
                           (inc visible-count) visible-count)
           tree-row (nth all-trees tree-row-num)
           row-end? (= (dec (count tree-row)) tree-index)
           next-row-num (if row-end? (inc tree-row-num) tree-row-num)
           next-tree-index (if row-end? 0 (inc tree-index))]
       (recur all-trees next-row-num next-tree-index visible-count)))))

(defn directional-score [directional-trees viewable-trees]
  (if (= (count directional-trees)
         (count viewable-trees))
    (count viewable-trees)
    (inc (count viewable-trees))))

(defn scenic-score [all-trees tree-index tree-row-num]
  (let [tree-row (nth all-trees tree-row-num)
        tree (nth tree-row tree-index)
        east-trees (get-east-trees all-trees tree-index tree-row-num)
        west-trees (get-west-trees all-trees tree-index tree-row-num)
        north-trees (get-north-trees all-trees tree-index tree-row-num)
        south-trees (get-south-trees all-trees tree-index tree-row-num)
        east-viewable-trees (take-while #(< % tree) east-trees)
        west-viewable-trees (take-while #(< % tree) (reverse west-trees))
        north-viewable-trees (take-while #(< % tree) (reverse north-trees))
        south-viewable-trees (take-while #(< % tree) south-trees)
        east-score (directional-score east-trees east-viewable-trees)
        west-score (directional-score west-trees west-viewable-trees)
        north-score (directional-score north-trees north-viewable-trees)
        south-score (directional-score south-trees south-viewable-trees)]
    (* east-score west-score north-score south-score)))

(defn highest-scenic-score
  ([]
   (highest-scenic-score (get-trees) 0 0 0))
  ([all-trees tree-row-num tree-index highest-scenic-score]
   (if (or (= tree-row-num (count all-trees))
           (= tree-index (count (last all-trees))))
     highest-scenic-score
     (let [scenic-score (scenic-score all-trees tree-index tree-row-num)
           tree-row (nth all-trees tree-row-num)
           row-end? (= (dec (count tree-row)) tree-index)
           next-row-num (if row-end? (inc tree-row-num) tree-row-num)
           next-tree-index (if row-end? 0 (inc tree-index))
           next-scenic-score (if (> scenic-score highest-scenic-score) scenic-score highest-scenic-score)]
       (recur all-trees next-row-num next-tree-index next-scenic-score)))))

  

