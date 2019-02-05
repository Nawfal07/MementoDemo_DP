
package mementodemo;

/**
 *
 * @author Nawfal
 */
public class CompteBancaire {
    private double solde;

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }
    
    public Memento saveStateToMemento(){
        return new Memento(solde);
    }
    
    public void getStateFromMemento(Memento c){
        solde = c.getSolde();
    }
}
