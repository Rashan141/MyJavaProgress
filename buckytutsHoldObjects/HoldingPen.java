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
public class HoldingPen {
    public static void main (String [] args){
        /*
        AnimalList ALO = new AnimalList();
        Dog d = new Dog();
        Fish f = new Fish();
        
        ALO.add(f);
        ALO.add(d);
        */
    
        Animal[] theList = new Animal[2];
        Dog D = new Dog();
        Fish F = new Fish();
        
        theList[0] = D;
        theList[1] = F;
        
        for(Animal x: theList)
            x.noise();
        
    }
}
