/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buckytutsStatic;

/**
 *
 * @author rawhitta
 */
public class Static {
    private String first;
    private String last;
    private static int members = 0;
    
        public Static (String fn, String ln){
            first = fn;
            last = ln;
            members++;
            
            
        }
        
        public String getFirst(){
            return first;
        }
        public String getLast(){
            return last;
        }
        public static int getMembers(){
            return members;
        }
}
