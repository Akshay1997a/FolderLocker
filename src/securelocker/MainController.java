package securelocker;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import com.jfoenix.controls.JFXProgressBar;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import securelocker.util.SecureLockerUtil;

public class MainController implements Initializable {
    
    @FXML
    public JFXProgressBar progressBar;
    SecureLockerUtil sl= new SecureLockerUtil();
    public Button but;
    public Text text;
    
    @FXML
    public void SignIn(ActionEvent event) throws IOException{
       sl.lodeFXML(getClass().getResource("UI/signin/Signin.fxml"), "Sign Up");
       
    }
    
    @FXML
    public void LogIn(ActionEvent event) throws IOException{
        sl.lodeFXML(getClass().getResource("UI/login/Login.fxml"), "Log In");
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       //progressBar.setStyle("-fx-accent : red;");
       //progressBar.setProgress(50);
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
