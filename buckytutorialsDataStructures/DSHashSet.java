/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buckytutorialsDataStructures;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author rawhitta
 */
public class DSHashSet {
    public static void main(String[] args){
       String[] things = {"apple","bob","ham", "bob","bacon"}; 
       List<String> list = Arrays.asList(things);
       
       
       System.out.printf("%s ", list);
       System.out.println();
       
       Set<String> set = new HashSet<String>(list);
       System.out.printf("%s ", set);
    }
}
