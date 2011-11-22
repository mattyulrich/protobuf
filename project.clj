(defproject protobuf "0.5.0-beta4"
  :description "Clojure-protobuf provides a clojure interface to Google's protocol buffers."
  :dependencies [[clojure "1.2.0"]
                 [ordered-set "0.2.2"]
                 [useful "0.7.4-alpha4"]
                 [uncle "0.1.0"]
                 [classlojure "0.6.3"]]
  :dev-dependencies [[gloss "0.2.0-rc1"]
                     [io "0.1.0-alpha1"]]
  :eval-in-leiningen true
  :jar-files ["proto"])
