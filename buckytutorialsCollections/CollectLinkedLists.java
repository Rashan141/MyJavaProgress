/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buckytutorialsCollections;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author rawhitta
 */
public class CollectLinkedLists {
    public static void main(String[] args){
        String[] randies = {"apples", "noobs", "pwnage", "bacon", "goats"};
        List<String> list1 = new LinkedList<String>();
        
        for(String x: randies)
            list1.add(x);
        
        String[] randies2 = {"sausage", "bacon", "goats", "Harry Potter"};
        List<String> list2 = new LinkedList<String>();
        
        for(String x: randies2)
            list2.add(x);
                
          list1.addAll(list2);
          list2 = null;
          
          printMe(list1);
          removeStuff(list1, 2, 5);
          printMe(list1);
          reverseMe(list1);
    }
    
    //PrintMe method
    private static void printMe(List<String> list){
        for (String b: list)
            System.out.printf("%s ", b);
            System.out.println();
        
    }
    
    //removeStuff method
    private static void removeStuff(List<String> list, int from, int to){
        list.subList(from, to).clear();
    
    }
    
    //reverseMe method
    private static void reverseMe(List<String> list){
        ListIterator<String> burn = list.listIterator(list.size());
        
        while (burn.hasPrevious()){
            System.out.printf("%s ", burn.previous());
        }
    }
}
