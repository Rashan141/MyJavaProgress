/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buckytutsExceptions;

import java.util.Scanner;

/**
 *
 * @author rawhitta
 */

public class Exceptions {
     public static void main(String [] args){
         Scanner input = new Scanner(System.in);
         int x = 1;
         do{
            try{
            System.out.println("Enter first number: ");
            int n1 = input.nextInt();
            System.out.println("Enter second number: ");
            int n2 = input.nextInt(); 
            int sum = n1/n2;
            System.out.println(sum);
            x = 2;}
            catch(Exception e){ // All encompassing param "Exception" e
             System.out.println("You can't do that!");
             System.out.println("System error: " + e);
                }
        }while(x == 1);
    }
}
