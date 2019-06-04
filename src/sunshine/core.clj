(ns sunshine.core
  (:require [clj-time.format :as tf]
            [clj-time.core :as t])
  ;;(:gen-class)
  )

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!")
  ;;(let [formatter (tf/formatter "yyyy-MM-dd HH:mm")
        ;;start-date (tf/parse formatter "2018-11-13 16:08")]
        ;;(println start-date))

        (let [start (-> (t/to-time-zone (t/now) (t/time-zone-for-id "UTC"))
                        (t/with-time-at-start-of-day)
                        (t/to-time-zone (t/time-zone-for-id "UTC"))
                        (t/plus (t/hours (rand-int 20)))
                        (t/plus (t/minutes (rand-int 15)))
                        (t/plus (t/seconds (rand-int 60))))
                end (-> (t/plus start (t/minutes (rand-int 30))) 
                      (t/plus (t/seconds (rand-int 60))))
                _  (do 
                      (println "---------------")
                      (println {:start start :end end})
                      (println "")) 
                ]

                    {:start start
                    :end end})
                   )


