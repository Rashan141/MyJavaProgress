/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buckytutsFileClass;

import java.util.Formatter;

/**
 *
 * @author rawhitta
 */
public class FileCreator {
     public static void main(String [] args){
         
         final Formatter x;
         
         try{
             x = new Formatter("Jinkies.txt");
             
             System.out.println("You created a file");
         }
         catch (Exception e){
             System.out.println("You have got an error.");
         }
         
     }
}
