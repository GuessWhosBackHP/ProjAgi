/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HugoP
 */
public class Tache {
    String lieu ; 
    Personne pers ; 
    int hdeb,hfin ; 
    String nom ; 

    public Tache(String lieu, Personne pers, int hdeb, int hfin,String nom ) {
        this.lieu = lieu;
        this.pers = pers;
        this.hdeb = hdeb;
        this.hfin = hfin;
        this.nom = nom ; 
    }

    @Override
    public String toString() {
        return "Tache{" +"Intitulé = "+ nom+ ", lieu=" + lieu + ", pers=" + pers.name + ", hdeb=" + hdeb + ", hfin=" + hfin  + '}';
    }
    
    
}
