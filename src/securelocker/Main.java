package securelocker;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import securelocker.util.SecureLockerUtil;


public class Main extends Application {
    
    SecureLockerUtil sceneloader = new SecureLockerUtil();
    
    @Override
    public void start(Stage stage) throws Exception {
     
        if(stage == null){
            System.out.println("main null");
        }
        SecureLockerUtil.stage = stage;
        SecureLockerUtil.stage.initStyle(StageStyle.UNDECORATED);
        sceneloader.lodeFXML(getClass().getResource("Main.fxml"), "Starting screen");

    }

    
    public static void main(String[] args) {
        launch(args);
        
    }
    
}
