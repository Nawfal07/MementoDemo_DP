/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mementodemo;

/**
 *
 * @author Nawfal
 */
public class MementoDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();
        
        originator.setSolde(14000);
        originator.setSolde(15200.3);
        careTaker.add(originator.saveStateToCompteBancaire());
        
        originator.setSolde(8520.24);
        careTaker.add(originator.saveStateToCompteBancaire());
        
        originator.setSolde(5000.0);
        careTaker.add(originator.saveStateToCompteBancaire());
        
        originator.setSolde(0);
        careTaker.add(originator.saveStateToCompteBancaire());
        
        System.out.println("Etat de solde actuel : "+originator.getSolde()+"DH");

        for(int i=0;i<3;i++){
            originator.getStateFromCompteBancaire(careTaker.get(i));
            System.out.println("Etat enregistré #"+(i+1)+" , solde est de : "+originator.getSolde()+"DH");
        }
        
        

    }
    
    
}
