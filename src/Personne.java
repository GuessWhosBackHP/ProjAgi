
import java.util.logging.Logger;

public class Personne {
    
    private String name;
    private String fonction;

    public Personne(String name, String fonction) {
        this.name = name;
        this.fonction = fonction;
    }

    @Override
    public String toString() {
        return "Nom : " + name + "\nFonction : " + fonction +"\n\n";
    }
        
}
