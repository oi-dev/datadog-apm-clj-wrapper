(defproject datadog-apm-clj-wrapper "0.1.1"
            :description "This project gives a way to use the datadog-apm tracing in clojure"
            :url "https://github.com/oi-dev/datadog-apm-clj-wrapper"
            :license {:name "Eclipse Public License"
                      :url "http://www.eclipse.org/legal/epl-v10.html"}

            :signing {:gpg-key "796FCFED"
                      :gpg-passphrase :env/gpgpass}

            :dependencies [[org.clojure/clojure "1.8.0"]
                           [environ "1.0.3"]
                           [com.datadoghq/dd-trace-ot "0.5.0"]
                           [io.opentracing/opentracing-api "0.31.0"]
                           [io.opentracing/opentracing-util "0.31.0"]])
