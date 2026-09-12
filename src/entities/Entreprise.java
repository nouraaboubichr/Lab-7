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

public class Entreprise {

    private Employe[] employes;
    private int nb;

    public Entreprise() {
        employes = new Employe[4];
        nb = 0;
    }

    public void ajouterEmploye(Employe e) {

        if (nb == employes.length) {
            Employe[] tmp = new Employe[employes.length * 2];
            for (int i = 0; i < employes.length; i++) {
                tmp[i] = employes[i];
            }
            employes = tmp;
        }

        employes[nb] = e;
        nb++;
    }

    public void afficherPaie() {
        System.out.println("=== Bulletin de paie ===");

        for (int i = 0; i < nb; i++) {
            System.out.println(employes[i]);
        }

        System.out.println("Masse salariale totale : " + masseSalariale());
    }

    public double masseSalariale() {
        double somme = 0;

        for (int i = 0; i < nb; i++) {
            somme = somme + employes[i].calculerSalaire();
        }

        return somme;
    }
}