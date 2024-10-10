package dad;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class EmailApp extends Application {

    private final RootController rootcontroller = new RootController();

    @Override
    public void start(Stage primaryStage) throws Exception {

        Scene modificarScene = new Scene(rootcontroller.getRoot());

        Stage modificarStage = new Stage();
        modificarStage.setTitle("EmailAPP");
        modificarStage.setScene(modificarScene);
        modificarStage.show();
    }
}
