/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buckytutsFinale;

/**
 *
 * @author rawhitta
 */
public class FinalBeginner {
    public static void main(String[] args){
        String a = "apples";
        String b = "bucky";
        String c = "BUCKY";
        
        System.out.println(a.length());
        
        if (a.equals("apples"))
                    System.out.println("It equals apples");
        
        if (b.equals(c))
                    System.out.println("They matched!");
        
        //Ignoring the capitalization
        if (b.equalsIgnoreCase(c))
                    System.out.println("They matched!");

        
    }
}
