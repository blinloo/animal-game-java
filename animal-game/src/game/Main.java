package game;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml")); //Gets design of the stage from the specified fxml file
        primaryStage.setTitle("Animal Game Title"); //Sets the title to display in the title bar
        primaryStage.setScene(new Scene(root, 600, 400)); //Sets size of the stage in pixels
        primaryStage.show(); //Makes the stage visible on the screen
    }


    public static void main(String[] args) {
        launch(args);
    }
}