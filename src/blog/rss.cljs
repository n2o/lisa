(ns blog.rss
  (:require [blog.config :refer [site-url]]))

(defn build-rss-feed [posts]
  (str "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>
        <rss version=\"2.0\" xmlns:atom=\"http://www.w3.org/2005/Atom\">
         <channel>
          <title>Christian Meter</title>
          <description>Blog</description>
          <link>" site-url "</link>
       <atom:link href=\"" site-url "rss.xml\" rel=\"self\" type=\"application/rss+xml\" />"
       (apply str (map #(str "<item>
            <guid>" site-url (:slug %) "</guid>
            <title>" (get-in % [:frontmatter :title]) "</title>
            <link>" site-url (:slug %) "</link>
            <pubDate>" (.toUTCString (get-in % [:frontmatter :published-at])) "</pubDate>
          </item>") posts))
       "</channel>
</rss>"))
