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
public class StringMethods {
     public static void main(String[] args) {
         String[] words = {"funk", "chunk", "furry", "baconator"};
         
         //startsWith
         for(String w: words){
             if(w.startsWith("fu"))
                 System.out.println(w + " starts with 'fu'");
         }
         
         //endssWith
         for(String w: words){
             if(w.endsWith("unk"))
                 System.out.println(w + " starts with 'unk'");
         }
    }
}
