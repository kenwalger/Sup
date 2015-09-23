package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Controller {

    @FXML private TextField twitterHandle;


    public void handleSaySup(ActionEvent actionEvent) {
        System.out.printf("Sup %s! %n", twitterHandle.getText());
        String tweet = "@" + twitterHandle.getText() + " Sup? \n \n -- from the JavaFX Sup? App \n by Treehouse";
        SupTweet.postTweet(tweet);
    }
}
