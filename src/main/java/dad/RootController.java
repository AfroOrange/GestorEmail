package dad;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

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
        System.exit(0);
    }

    @FXML
    void onEmptyAction(ActionEvent event) {
        emailFrom.clear();
        emailTo.clear();
        messageArea.clear();
        passwordField.clear();
        portNumber.clear();
        serverName.clear();
        sslCheckBox.setSelected(false);
        subjectText.clear();
    }

    @FXML
    void onSendAction(ActionEvent event) throws EmailException {
        System.setProperty("mail.smtp.debug", "true");

        if (emailFrom.getText().isEmpty()
                || emailTo.getText().isEmpty()
                || messageArea.getText().isEmpty()
                || passwordField.getText().isEmpty()
                || portNumber.getText().isEmpty() || serverName.getText().isEmpty()
                || subjectText.getText().isEmpty()) {

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Please fill all the fields");
            alert.showAndWait();

        } else {
            Email email = getEmail();
            email.send();
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Message sent");
            alert.setHeaderText(null);
            alert.setContentText("Email sent successfully");
            alert.showAndWait();
        }
    }

    private Email getEmail() {
        Email email = new SimpleEmail();
        email.setHostName(serverName.getText());
        email.setSmtpPort(Integer.parseInt(portNumber.getText()));
        email.setSSLOnConnect(sslCheckBox.isSelected()); // Use SSL on connect for SSL-based ports like 465

        try {
            email.setFrom(emailFrom.getText());
            email.setSubject(subjectText.getText());
            email.setMsg(messageArea.getText());
            email.addTo(emailTo.getText());
            email.setAuthentication(emailFrom.getText(), passwordField.getText()); // Set authentication

        } catch (EmailException e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("Error");
            alert.setContentText("Failed to create email: " + e.getMessage());
            alert.showAndWait();
            return null;
        }
        return email;
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public GridPane getRoot() {
        return root;
    }
}
