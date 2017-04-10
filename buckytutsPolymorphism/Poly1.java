/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buckytutsPolymorphism;

/**
 *
 * @author rawhitta
 */
public class Poly1 extends Poly{
    @Override //Not necessary, but is good practice
    public void speak(){
        System.out.println("This is the first Poly, in our group.");
    }
    
    @Override
    public void sides(){}
}
