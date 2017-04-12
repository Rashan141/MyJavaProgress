/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buckytutorialsCollections;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Iterator;
/**
 *
 * @author rawhitta
 */
public class CollectionStuff {
    public static void main(String[] args){
        String[] things= {"eggs", "lasers", "hats", "pie"};
        List<String> list1= new ArrayList<>();
        
        //add array items to list1
        for(String x: things)
            list1.add(x);
        
        System.out.println("List 1 has:");

        for(int i = 0; i<list1.size(); i++)
            System.out.printf("%s ", list1.get(i));
                    
        System.out.println();

        String[] moreThings = {"lasers", "eggs"};
        List<String> list2 = new ArrayList<>();
        
        //add items to list2
        for(String y: moreThings)
            list2.add(y);
        System.out.println();
               
        System.out.println("List 2 has:");
        for(int i = 0; i<list2.size(); i++)
            System.out.printf("%s ", list2.get(i));
        
        //Prints the List out
       // System.out.println(list1);
       
       editList(list1, list2);
       System.out.println();
              System.out.println();
              
       System.out.println("List 1 - list 2 has:");
       for(int i = 0; i<list1.size(); i++)
            System.out.printf("%s ", list1.get(i));
       
              System.out.println();
    }
    
    public static void editList(List<String> l1, List<String> l2){
        Iterator<String> iT = l1.iterator();
        while(iT.hasNext()){
            if(l2.contains(iT.next()))
                iT.remove();
        }
    }

}
