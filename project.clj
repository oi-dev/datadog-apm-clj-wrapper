(defproject datadog-apm-clj-wrapper "0.1.0"
  :description "This project wraps the java implementation for datadog apm"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :signing {:gpg-key "796FCFED"
            :gpg-passphrase :env/gpgpass}

  :dependencies [[org.clojure/clojure "1.8.0"]
                 [environ "1.0.3"]
                 [com.datadoghq/dd-trace-ot "0.5.0"]
                 [io.opentracing/opentracing-api "0.31.0"]
                 [io.opentracing/opentracing-util "0.31.0"]])
