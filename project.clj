(defproject com.palletops/uberimage "0.3.1-SNAPSHOT"
  :description "Leiningen plugin to create a docker image for a project uberjar"
  :url "http://github.com/palletops/lein-uberimage"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :eval-in-leiningen true
  :min-lein-version "2.4.3"
  :dependencies [[com.palletops/clj-docker "0.1.3"]
                 [org.clojure/core.async "0.1.303.0-886421-alpha"]
                 [org.clojure/data.codec "0.1.0"]
                 [org.clojure/tools.cli "0.3.1"]
                 [net.oauth.core/oauth "20100527"]]
  :global-vars {*warn-on-reflection* true})
