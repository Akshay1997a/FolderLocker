package securelocker.UI.signin;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import securelocker.util.SecureLockerUtil;


public class SigninController implements Initializable {

    public Pane pane1,pane2;
    SecureLockerUtil sceneloader = new SecureLockerUtil();
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    @FXML
    public void nextBut(ActionEvent event){
        pane1.setVisible(false);
        pane2.setVisible(true);
    }
    
    @FXML
    public void closeBut(ActionEvent event){
        Platform.exit();
    }
    
    @FXML
    public void OnPressed(MouseEvent event){
        sceneloader.pressed(event.getScreenX(), event.getScreenY());
    }
    
    @FXML
    public void OnDrag(MouseEvent event){
        sceneloader.drag(event.getScreenX(), event.getScreenY());
    }
}
