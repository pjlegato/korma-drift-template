(defproject korma-drift-template "0.1.0"
  :description "Template for connecting Korma, Drift, and PostgreSQL"
  :url "http://github.com/pjlegato"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[drift "1.5.2"]
                 [korma "0.3.0-RC5"]
                 [org.clojure/clojure "1.5.1"]
                 [org.postgresql/postgresql "9.2-1002-jdbc4"]]
  
  ;; with this plugin, you can run migrations using "lein migrate" and 
  ;; create new migration files with "lein create-migration"
  :plugins [[drift "1.5.2"]])