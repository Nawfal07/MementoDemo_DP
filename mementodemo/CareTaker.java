/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mementodemo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nawfal
 */
public class CareTaker {
    private List<CompteBancaire>  compteList = new ArrayList<CompteBancaire>();
    
    public void add(CompteBancaire state){
        compteList.add(state);
    }
    
    public CompteBancaire get(int index){
        return compteList.get(index);
    }
}
