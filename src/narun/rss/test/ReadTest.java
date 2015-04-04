package narun.rss.test;

import narun.rss.model.Feed;
import narun.rss.model.FeedMessage;
import narun.rss.read.RSSFeedParser;

public class ReadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 RSSFeedParser parser = new RSSFeedParser("http://www.vogella.com/article.rss");
		    Feed feed = parser.readFeed();
		    System.out.println(feed);
		    for (FeedMessage message : feed.getMessages()) {
		      System.out.println(message);

		    }
	}

}
