package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Controller {

    @FXML private TextField firstName;

    private String tweet;

    public void handleSaySup(ActionEvent actionEvent) {
        System.out.printf("Sup %s! %n", firstName.getText());
        tweet = "@craigsdennis Sup? - from the Sup? App";
        SupTweet.postTweet(tweet);
    }
}
