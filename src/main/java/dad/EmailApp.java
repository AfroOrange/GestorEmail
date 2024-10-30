package dad;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.util.Objects;

public class EmailApp extends Application {

    private final RootController rootcontroller = new RootController();

    @Override
    public void start(Stage primaryStage) throws Exception {

        Scene emailScene = new Scene(rootcontroller.getRoot());

        Image icon = new Image(Objects.requireNonNull(getClass().getResource("/images/email_sendicon.png")).toString());
        Stage emailStage = new Stage();

        emailStage.getIcons().add(icon);
        emailStage.setTitle("EmailAPP");
        emailStage.setScene(emailScene);
        emailStage.show();
    }
}
