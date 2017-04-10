/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buckytutsStatic;

import buckytutsStatic.Static;

/**
 *
 * @author rawhitta
 */
public class UsingStatics {
    public static void main(String [] args){
        Static member1 = new Static("Megan","Fox");
        Static member2 = new Static("Natalie", "Portman");
        Static member3 = new Static("Taylor", "Swift");
        
        System.out.println();
        System.out.println(member2.getFirst());
        System.out.println(member2.getLast());
        System.out.println(member2.getMembers());
        
        System.out.println();
        System.out.println(Static.getMembers());
        
    }
}
