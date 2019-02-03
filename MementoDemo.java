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
        CompteBancaire originator = new CompteBancaire();
        CareTaker careTaker = new CareTaker();
        
        originator.setSolde(14000);
        originator.setSolde(15200.3);
        careTaker.add(originator.saveStateToMemento());
        
        originator.setSolde(8520.24);
        careTaker.add(originator.saveStateToMemento());
        
        originator.setSolde(5000.0);
        careTaker.add(originator.saveStateToMemento());
        
        originator.setSolde(0);
        careTaker.add(originator.saveStateToMemento());
        
        System.out.println("Etat de solde actuel : "+originator.getSolde()+"DH");

        for(int i=0;i<3;i++){
            originator.getStateFromMemeto(careTaker.get(i));
            System.out.println("Etat enregistré #"+(i+1)+" , solde est de : "+originator.getSolde()+"DH");
        }
        
        

    }
    
    
}
