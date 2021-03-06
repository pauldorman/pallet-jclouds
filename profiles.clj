{:dev {:dependencies
       [[org.clojure/clojure "1.4.0"]
        [com.palletops/pallet "0.8.0-beta.10"]
        [com.palletops/pallet "0.8.0-beta.10" :classifier "tests"]
        [ch.qos.logback/logback-classic "1.0.9"]

        [org.jclouds/jclouds-all "1.5.5"]
        [org.jclouds.driver/jclouds-sshj "1.5.5"]
        [org.jclouds.driver/jclouds-slf4j "1.5.5"]]

       :plugins [[codox/codox.leiningen "0.6.4"]
                 [lein-marginalia "0.7.1"]]}
 :no-checkouts {:checkout-shares ^:replace []} ; disable checkouts
 :doc {:dependencies [[com.palletops/pallet-codox "0.1.0"]]
       :codox {:writer codox-md.writer/write-docs
               :output-dir "doc/api/1.5"
               :src-dir-uri "https://github.com/pallet/pallet-repl/blob/develop"
               :src-linenum-anchor-prefix "L"}
       :aliases {"marg" ["marg" "-d" "doc/source/1.5"]
                 "codox" ["doc"]
                 "doc" ["do" "codox," "marg"]}} :release
 {:plugins [[lein-set-version "0.3.0"]]
  :set-version
  {:updates [{:path "README.md" :no-snapshot true}]}}
 :jclouds-1.5.6 {:dependencies ^replace
                 [[com.palletops/pallet "0.8.0-beta.10"]
                  [org.jclouds/jclouds-compute "1.5.6"]
                  [org.jclouds/jclouds-blobstore "1.5.6"]
                  [org.jclouds/jclouds-all "1.5.6"]
                  [org.jclouds.driver/jclouds-sshj "1.5.6"]
                  [org.jclouds.driver/jclouds-slf4j "1.5.6"]]}}
