(ns pensieve.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (let [[type dir] args]
    (cond
      (= "pensieve" type) (pensieve/main dir)
      :else (println "Please use a known system as first arg [pensieve, pg]" ))))
