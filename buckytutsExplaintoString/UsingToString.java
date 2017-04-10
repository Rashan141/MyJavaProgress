/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buckytutsExplaintoString;

/**
 *
 * @author rawhitta
 */
public class UsingToString {
    public static void main(String [] args){
        ExpToString ETS = new ExpToString(12, 32, 1996);
        ETSinClass EiC = new ETSinClass("Greg", ETS);
        
        System.out.println(EiC);
    }
}
