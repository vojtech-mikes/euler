(ns euler.core
  (:gen-class))

;; Problem 1

(reduce + (filterv #(or (= (mod % 3) 0) (= (mod % 5) 0)) (range 1 1000)))

;; Problem 2

(defn fibseq [x s] (if (< (second x) 4000000) 
                     (recur (list (second x) (reduce + x))
                            (if (even? (reduce + x)) (+ s (reduce + x)) s)) s))

