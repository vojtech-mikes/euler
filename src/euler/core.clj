(ns euler.core
  (:gen-class))

;; Problem 1

(reduce + (filterv #(or (= (mod % 3) 0) (= (mod % 5) 0)) (range 1 1000)))

