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

public class EmployeHoraire extends Employe {

    private double tauxHoraire;
    private double heuresTravaillees;

    public EmployeHoraire(String nom, String prenom, double tauxHoraire, double heuresTravaillees) {
        super(nom, prenom);
        this.tauxHoraire = tauxHoraire;
        this.heuresTravaillees = heuresTravaillees;
    }

    public double getTauxHoraire() {
        return tauxHoraire;
    }

    public double getHeuresTravaillees() {
        return heuresTravaillees;
    }

    public double calculerSalaire() {
        return tauxHoraire * heuresTravaillees;
    }
}
