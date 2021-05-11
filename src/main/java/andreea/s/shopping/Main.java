package andreea.s.shopping;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;



public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Label label = new Label("Shopping app");
       Scene scene = new Scene(label);
       primaryStage.setScene(scene);
       primaryStage.show();

    }
}
