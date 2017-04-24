/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buckytutorialsRecursion;

/**
 *
 * @author rawhitta
 */
public class Recursion {
    public static void main(String[] args){
        System.out.println(Factorial(5));
    }
    
    //factorial
    public static long Factorial(long ace){
        if(ace <= 1)
            return 1;
        else
          return ace * Factorial(ace -1);  
    }
}
