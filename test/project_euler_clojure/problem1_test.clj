(ns project-euler-clojure.core-test
  (:require [clojure.test :refer :all]
            [project-euler-clojure.core :refer :all]))

(deftest multiple-of-3-or-5 
  (testing "multiple of 3 returns true"
    (is (= (multiple-of-3-or-5? 3) true)))
  (testing "multiple of 5 returns true"
    (is (= (multiple-of-3-or-5? 5) true)))
  (testing "multiple 3 and 5 returns true"
    (is (= (multiple-of-3-or-5? 15) true)))
  (testing "non-multiple of 3 or 5 returns false"
    (is (= (multiple-of-3-or-5? 2) false))))

(deftest problem-1 
  (testing "sum of multiples of natural numbers below 10 is 23"
    (is (= (problem-1 10) 23)))
  (testing "sum of multiples of natural numbers below 1000 is 233168"
    (is (= (problem-1 1000) 233168))))
