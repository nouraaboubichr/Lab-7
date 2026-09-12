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

public class EmployeSalarie extends Employe {

    protected double salaireMensuel;

    public EmployeSalarie(String nom, String prenom, double salaireMensuel) {
        super(nom, prenom);
        this.salaireMensuel = salaireMensuel;
    }

    public double getSalaireMensuel() {
        return salaireMensuel;
    }

    public double calculerSalaire() {
        return salaireMensuel;
    }
}