(ns datadog-apm-clj-wrapper.test.core-test
  (:require [clojure.test :refer :all]
            [datadog-apm-clj-wrapper.core :refer :all]))

(deftest test-instrumentation
  (testing "the function passed to instrumentation gets evaluated or not"
    (is (= 5 (instrumentation "new-operation" #(+ 4 1))))))
