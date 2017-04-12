/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buckytutorialsCollections;

import java.util.Arrays;
import java.util.LinkedList;

/**
 *
 * @author rawhitta
 */
public class ViceVersa {
    public static void main(String[] args){
        
        String[] tings = {"babies", "watermelons", "melons", "fudge"};
        
        //Convert array to a list
        LinkedList<String> theList = new LinkedList<String>(Arrays.asList(tings));
        
        theList.add("pumpkin"); 
        theList.addFirst("First Thing"); 
        
        //Convert back to an array   
        tings = theList.toArray(new String[theList.size()]);
        for(String x: tings)
            System.out.printf("%s ", x);
    }
}
