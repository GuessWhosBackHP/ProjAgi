import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author HugoP
 */
public class main extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        System.out.println("yolo ya mes couilles");
        System.out.println("Ferme la !");
        System.out.println("salut les loulous !");
        
       

        stage.setScene(scene);
        stage.show();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //launch(args);
         Personne p = new Personne("Clement","Prof","batar@ricard.fr");
         Personne p2 = new Personne("Simon","suceur","batar@ricard.fr");
         Tache t = new Tache("DTC",p,12,13,"branlette");
         Tache t2 = new Tache("DTChatte",p2,14,15,"philatelie");
         Journee j = new Journee();
         j.listTache.add(t);
         j.listTache.add(t2);
        //System.out.println(p);
        //System.out.println(t);
        System.out.println(j);
    }
    
}
