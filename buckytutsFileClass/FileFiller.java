/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buckytutsFileClass;

import java.util.Formatter;
import java.util.Scanner;
        
/**
 *
 * @author rawhitta
 */

public class FileFiller {
     private Formatter x;
     private Scanner key = new Scanner(System.in);
     
     public void openFile(){
         try{
             x = new Formatter("Asia.txt");
         }catch (Exception e){
             System.out.println("Ya got an error chief.");
         }
     }
     
     public void addRecords(){
         
         //Works with input, and hardcoded strings
         x.format("%s %s %s", key.nextLine(), "Rashan", "Whittaker");
     }
     
     public void closeFile(){
         x.close();
     }
}
