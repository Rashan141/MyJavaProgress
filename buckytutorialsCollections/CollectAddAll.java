/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buckytutorialsCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


/**
 *
 * @author rawhitta
 */
public class CollectAddAll {
       public static void main(String[ ]args){
           
           //Convert stuff Array to a List
           String[] stuff = {"Apples", "Beef", "Corn", "Ham"};
           List<String> list1 = Arrays.asList(stuff);
           
           ArrayList<String> list2 = new ArrayList<String>();
           list2.add("Youtube");
           list2.add("Video Games");
           list2.add("Fanfiction");
           
           for (String x: list2)
               System.out.printf("%s ", x);
           
           Collections.addAll(list2, stuff);
           
           System.out.println();
           
           for(String x: list2)
               System.out.printf("%s ", x);
                      
           System.out.println();
           
           //Frequency of words in the selected Collections item
           System.out.println(Collections.frequency(list2, "digg"));               
           System.out.println();
           
           //Check if disjointed - If they have nothing in common
           boolean tof = Collections.disjoint(list1, list1);
           System.out.println(tof);
           
           if(tof)
                System.out.println("They have nothing in common");
           else
                System.out.println("They have something in common");
           
       }
}
