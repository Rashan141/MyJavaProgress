/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buckytutorialsStringMethods;

/**
 *
 * @author rawhitta
 */
public class MoreStrings {
    public static void main(String[] args){
        
        String a = "Bacon ";
        String d = "Monster";
        String c = "     Tea     ";
        String b = "Let'splayagameofdarkfables";
        
        System.out.println(a.concat(d));
        System.out.println(b.indexOf("lay", 10));
        System.out.println(a.replace("B", "F"));
        System.out.println(a.toUpperCase());
        System.out.println(c.trim());
        
    }
}
