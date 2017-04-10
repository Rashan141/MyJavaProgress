/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buckytutsVariableFreeRange;

/**
 *
 * @author rawhitta
 */
public class VariousParamLength {
        public static void main(String [] args){
            System.out.println(average(4,5,6,7,8,8,9,9,0,5));
        }
        
        public static int average(int...numbers){
            int total = 0;
            
            for (int n : numbers)
                total+=n;
            
           return total/numbers.length;
        }
}
