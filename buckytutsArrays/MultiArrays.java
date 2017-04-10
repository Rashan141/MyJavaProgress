/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buckytutsArrays;

/**
 *
 * @author rawhitta
 */
public class MultiArrays {
    public static void main(String [] args){
        int firstarray[][] = {{2,3,4,5}, {6,7,8,9,10}};
        int secondarray[][] = {{30,31,32,33},{43},{4,5,6}};
        
        System.out.println("Print out my first Multi Array");
        display(firstarray);
        
        System.out.println();
        
        System.out.println("Print out my second Multi Array");
        display(secondarray);
    }
    
    public static void display(int v[][]){
        for (int row = 0; row < v.length; row++){
            for(int column = 0; column < v[row].length; column++){
            System.out.print(v[row][column]+"\t");
            }
        }
    }
}
