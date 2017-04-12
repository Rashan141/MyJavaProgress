/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buckytutorialsDataStructures;

import java.util.PriorityQueue;

/**
 *
 * @author rawhitta
 */
public class DSQueue {
    public static void main(String[] args){
        
        PriorityQueue<String> Q = new PriorityQueue<String>();
        
        Q.offer("First");
        Q.offer("Second");
        Q.offer("Third");
        
        System.out.printf("%s ", Q);
        System.out.println();
        
        System.out.printf("%s ", Q.peek());
        System.out.println();
        
        Q.poll();
        System.out.printf("%s ", Q);
    }
}
