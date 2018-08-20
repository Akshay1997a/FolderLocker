package securelocker.UI.login;

import javafx.scene.input.MouseEvent;
import javafx.scene.input.MouseDragEvent;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.stage.Stage;
import securelocker.util.SecureLockerUtil;

public class LoginController implements Initializable {

    @FXML
    public PasswordField passField;
    public Label error;
    public double screenX,screenY;
    SecureLockerUtil sl = new SecureLockerUtil();
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
    @FXML
    public void closeBut(ActionEvent event){
        Platform.exit();
    }
    
    @FXML
    public void openAction(ActionEvent event){
        if(passField.getText().toString()!= "admin"){
            error.setText("Incorrect Password!");
            passField.setText("");
        }
        else{
            error.setText("");
        }
    }
    @FXML
    void OnPressed(MouseEvent event) {
        sl.pressed(event.getScreenX(), event.getScreenY());
    }
    
    @FXML
    void OnDrag(MouseEvent event){
        sl.drag(event.getScreenX(),event.getScreenY());
    }
    
}
