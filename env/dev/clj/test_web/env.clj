(ns test-web.env
  (:require [selmer.parser :as parser]
            [clojure.tools.logging :as log]
            [test-web.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[test-web started successfully using the development profile]=-"))
   :stop
   (fn []
     (log/info "\n-=[test-web has shut down successfully]=-"))
   :middleware wrap-dev})
