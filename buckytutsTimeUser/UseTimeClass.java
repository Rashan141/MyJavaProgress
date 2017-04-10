/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buckytutsTimeUser;

/**
 *
 * @author rawhitta
 */
public class UseTimeClass {
   public static void main(String [] args){
       Time timeObject = new Time();
       System.out.println(timeObject.toMilitary());
       System.out.println(timeObject.toString());
       
       timeObject.setTime(13, 45, 7);
       
       System.out.println(timeObject.toMilitary());
       System.out.println(timeObject.toString());
   }
}
