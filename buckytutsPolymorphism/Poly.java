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

/*Abstract classes, are onyl meant to be inherited.
*Not only that, but when there is even one abstract method in a class
* The class MUST be abstract itself. Not only that, but if there is an abstract 
*method in a class, then all of it's subclasses MUST make use of that method in
*their body. Essentially overriding them.
*/

abstract public class Poly { 
    public void speak(){
    
    }
    
    public abstract void sides();
}
