package korara.ui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage stage) {
        Scene scene = new Scene(new Pane(), 500, 500);
        stage.setScene(scene);


        stage.setTitle("Korara");
        stage.show();
    }


}
