(ns bare-http.main
  (:require [clj-http.client :as client]))

(defn -main
  "I don't do a whole lot."
  []
  (println (:headers (client/get "https://gra.corefact.com"))))
