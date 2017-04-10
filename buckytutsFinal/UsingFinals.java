/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buckytutsFinal;

import buckytutsFinal.FinalEx;

/**
 *
 * @author rawhitta
 */
public class UsingFinals {
    
        public static void main(String[] args){
            FinalEx FE = new FinalEx(10);
            
            for (int i = 0; i < 5; i++){
                FE.add();
                System.out.printf("%s",FE.toString());
            }
        }
}
