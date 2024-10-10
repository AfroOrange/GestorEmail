package dad;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class RootController implements Initializable {

    @FXML
    private GridPane root;

    @FXML
    private Button closeButton;

    @FXML
    private TextField emailFrom;

    @FXML
    private TextField emailTo;

    @FXML
    private Button emptyButton;

    @FXML
    private TextArea messageArea;

    @FXML
    private PasswordField passwordField;

    @FXML
    private TextField portNumber;

    @FXML
    private Button sendButton;

    @FXML
    private TextField serverName;

    @FXML
    private CheckBox sslCheckBox;

    @FXML
    private TextField subjectText;

    public RootController() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/RootView.fxml"));
            loader.setController(this);
            loader.load();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    void onCloseAction(ActionEvent event) {

    }

    @FXML
    void onEmptyAction(ActionEvent event) {

    }

    @FXML
    void onSendAction(ActionEvent event) {

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public GridPane getRoot() {
        return root;
    }
}
