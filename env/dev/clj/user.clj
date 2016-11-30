(ns user
  (:require [mount.core :as mount]
            test-web.core))

(defn start []
  (mount/start-without #'test-web.core/repl-server))

(defn stop []
  (mount/stop-except #'test-web.core/repl-server))

(defn restart []
  (stop)
  (start))


