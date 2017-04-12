/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buckytutorialsCollections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author rawhitta
 */
public class CollectMethodSort {
    public static void main(String[] args){
        String[] stuff = {"apples","lemons","geese","bacon","Youtube"};
        List<String> l1 = Arrays.asList(stuff);
        
        Collections.sort(l1);
        System.out.printf("%s\n", l1);
        
        Collections.sort(l1, Collections.reverseOrder());
        System.out.printf("%s\n", l1);


    }
}
