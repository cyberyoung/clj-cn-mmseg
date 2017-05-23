(defproject org.clojars.cyberyoung/clj-cn-mmseg "0.1.5"
  :description "clj-cn-mmseg是一个用clojure实现的mmseg中文分词工具包。"
  :url "https://github.com/cyberyoung/clj-cn-mmseg"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0-alpha14"]
                 [org.clojure/tools.logging "0.3.1"]]
  :scm {:name "git"
        :url "http://www.eclipse.org/legal/epl-v10.html"}
  :signing {:gpg-key "pku.liyang@gmail.com"}
  :deploy-repositories [["clojars" {:creds :gpg
                                    :sign-releases false}]])
