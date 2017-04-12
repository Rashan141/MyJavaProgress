/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buckytutorialsDataStructures;

import java.util.Stack;

/**
 *
 * @author rawhitta
 */
public class DSStackPushPop {
    public static void main(String[] args){
        
        Stack<String> stack = new Stack<String>();
        stack.push("First In");
        printStack(stack);
        stack.push("Middle");
        printStack(stack);
        stack.push("First Out");
        printStack(stack);
        
        stack.pop();
        printStack(stack);

        stack.pop();        
        printStack(stack);

        stack.pop();        
        printStack(stack);
        
    }
    
    private static void printStack(Stack<String> s){
        if(s.isEmpty())
            System.out.println("You have nothing in your stack.");
        else
            System.out.printf("%s TOP\n", s);
    }
}
