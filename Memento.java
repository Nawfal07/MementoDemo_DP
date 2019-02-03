/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mementodemo;

/**
 *
 * Classe qu'on veut enregistrer son etat
 */
public class Memento {
    private double solde;

    public Memento(double solde) {
        this.solde = solde;
    }

    public double getSolde() {
        return solde;
    }
    
    
}
