/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author hp
 */

public abstract class Employe {

    protected String nom;
    protected String prenom;

    public Employe(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public abstract double calculerSalaire();

    public String toString() {
        return nom + " " + prenom + " -> Salaire = " + calculerSalaire();
    }
}
