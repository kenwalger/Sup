package sample;

import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;

/**
 * Created by Ken on 9/13/2015.
 */
public class SupTweet {

    static String consumerKeyStr = TwitterKeys.consumerKeyStr;
    static String consumerSecretStr = TwitterKeys.consumerSecretStr;
    static String accessTokenStr = TwitterKeys.accessTokenStr;
    static String accessTokenSecretStr = TwitterKeys.accessTokenSecretStr;

    public static void postTweet(String tweet) {

        try {
            Twitter twitter = new TwitterFactory().getInstance();
            twitter.setOAuthConsumer(consumerKeyStr, consumerSecretStr);
            AccessToken accessToken = new AccessToken(accessTokenStr,
                                                      accessTokenSecretStr);
            twitter.setOAuthAccessToken(accessToken);

            twitter.updateStatus(tweet);

            System.out.println("Cool, you just Tweeted Sup?");
        } catch (TwitterException te) {
            te.printStackTrace();
        }

    }

}
