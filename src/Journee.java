
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author HugoP
 */
public class Journee {

    List<Tache> listTache;

    public Journee() {
      this.listTache = new ArrayList<Tache>(); 
    }

    @Override
    public String toString() {
        String res = "Journee : ";
        ListIterator<Tache> it = listTache.listIterator();
        while (it.hasNext()) {
            res += "\n" + it.next().nom;
            res += "\n" + it.next().pers;
            res += "\n" + it.next().hdeb;
            res += "\n" + it.next().hfin;
            res += "\n" + it.next().lieu;

        }
        return res;
    }
}
