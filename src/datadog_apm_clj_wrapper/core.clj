(ns datadog-apm-clj-wrapper.core
  (:require [environ.core :refer [env]]))

(def service-name (if-not (empty? (env :service-name)) (env :service-name) "default-service"))

(defn instrumentation [operation tracing-fn]
  (let [tracer (. io.opentracing.util.GlobalTracer get)
        scope (. (. tracer buildSpan operation) startActive true)]
    (. (. scope span) setTag (. datadog.trace.api.DDTags SERVICE_NAME) service-name)
    (try
      (tracing-fn)
      (catch Exception e (str "caught exception: " (.getMessage e)))
      (finally (. scope close)))))
