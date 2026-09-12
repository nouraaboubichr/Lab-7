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

public class Vendeur extends EmployeSalarie {

    private double commission;

    public Vendeur(String nom, String prenom, double salaireMensuel, double commission) {
        super(nom, prenom, salaireMensuel);
        this.commission = commission;
    }

    public double getCommission() {
        return commission;
    }

    public double calculerSalaire() {
        return salaireMensuel + commission;
    }
}