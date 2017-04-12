/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buckytutorialsCollections;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author rawhitta
 */
public class CollectReverse {
   
    public static void main(String[] args){
        //Create an Array and convert it to List
        Character[] ray = {'p','w','n'};
        List<Character> L = Arrays.asList(ray);
        System.out.println("List is : ");
        output(L);
        
        ///Reverse and prit out the List
        Collections.reverse(L);
        System.out.println("After reverse: ");
        output(L);
        
        //Create a new Array and a new List
        Character[] newArray = new Character[3];
        List<Character> listCopy = Arrays.asList(newArray);
        
        //Copy contest of List into List copy
        Collections.copy(listCopy, L);
        System.out.println("Copy of list, copyList : ");
        output(listCopy);
        
        //Fill collection with stuff
        Collections.fill(L, 'X');
        System.out.println("After filling the list:");
        output(L);
    }
    //Output method
    private static void output(List<Character> theList){
        Iterator<Character> iT = theList.iterator();
        for(int i = 0; i < theList.size(); i++)
            System.out.print(iT.next() + " ");
        
        System.out.println();
    }
    
    
}
