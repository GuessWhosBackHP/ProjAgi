
import java.util.logging.Logger;

public class Personne {
    
     String name;
     String fonction;
     String email ; 
    

    public Personne(String name, String fonction,String email) {
        this.name = name;
        this.fonction = fonction;
        this.email = email ; 
    }

    @Override
    public String toString() {
        return "Nom : " + name + "\nFonction : " + fonction +"\n" + "Email : "+ email ; 
    }
        
}
