
package mementodemo;

/**
 *
 * @author Nawfal
 */
public class Originator {
    private double solde;

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }
    
    public CompteBancaire saveStateToCompteBancaire(){
        return new CompteBancaire(solde);
    }
    
    public void getStateFromCompteBancaire(CompteBancaire c){
        solde = c.getSolde();
    }
}
