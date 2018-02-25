(ns project-euler-clojure.core-test
  (:require [clojure.test :refer :all]
            [project-euler-clojure.core :refer :all]))

(deftest a-test
  (testing "problem 1"
    (is (= (problem-1) 1))))
