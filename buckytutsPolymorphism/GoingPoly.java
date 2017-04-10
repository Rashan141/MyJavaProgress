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
public class GoingPoly {
    public static void main (String [] args){
        
        Poly [] holds = new Poly[2];
        holds[0] = new Poly1();
        holds[1] = new Poly2();
        
        BestPoly BE = new BestPoly();
        Poly PO = new Poly1(); //If Poly didn't have Abstract on it, it'd work
        
        BE.GrabEm(PO);
        BE.GrabEm(holds[1]);
    }
}
