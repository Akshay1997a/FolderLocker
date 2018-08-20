package securelocker.util;

import java.io.IOException;
import java.net.URL;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.AnchorPane;

public class SecureLockerUtil {
 
    public static Stage stage;
    double xoffset,yoffset;
    
     public void lodeFXML(URL loc,String title) throws IOException{
        
         Parent parent = FXMLLoader.load(loc);
         Scene scene = new Scene(parent);
         SecureLockerUtil.stage.setScene(scene);
         SecureLockerUtil.stage.setTitle(title);
         SecureLockerUtil.stage.show();
         System.out.println("X="+stage.getX()+" y="+stage.getY());
     }
     
    public void pressed(double x,double y){
        xoffset = 0;
        yoffset = 0;
        xoffset = stage.getX() - x;
        yoffset = stage.getY() - y;
        //System.out.println("X="+x+" y="+y);
    }
    
    public void drag(double x, double y){
        SecureLockerUtil.stage.setX(x + xoffset);
        SecureLockerUtil.stage.setY(y + yoffset);
        System.out.println("X="+stage.getX()+" y="+stage.getY());
    }
    
    
}
