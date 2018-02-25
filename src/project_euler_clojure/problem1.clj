(ns project-euler-clojure.core)

(defn multiple-of-3-or-5?
  [n]
  (or (zero? (mod n 3)) (zero? (mod n 5))))

(defn problem-1
  "Sum of multiples of 3 and 5 limit 1000"
  [limit]
  (reduce + (filter multiple-of-3-or-5? (range limit))))
