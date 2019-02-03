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
    private List<Memento>  compteList = new ArrayList<Memento>();
    
    public void add(Memento state){
        compteList.add(state);
    }
    
    public Memento get(int index){
        return compteList.get(index);
    }
}
