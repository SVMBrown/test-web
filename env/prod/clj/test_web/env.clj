(ns test-web.env
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[test-web started successfully]=-"))
   :stop
   (fn []
     (log/info "\n-=[test-web has shut down successfully]=-"))
   :middleware identity})
