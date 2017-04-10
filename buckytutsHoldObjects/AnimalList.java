/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buckytutsHoldObjects;

/**
 *
 * @author rawhitta
 */
public class AnimalList {
    private Animal[] theList = new Animal[5]; 
    private int i =0;
    
    public void add(Animal a){
        if(i < theList.length){
            theList[i] = a;
            System.out.println("Animal added at index " + i);
            i++;
        }
            
    }
}
