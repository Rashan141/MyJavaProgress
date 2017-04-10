/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buckytutsFinal;

/**
 *
 * @author rawhitta
 */
public class FinalEx {
    private int sum;
    private final int NUMBER;
    
    public FinalEx(int x){
        NUMBER = x;
    }
    
    public void add(){
        sum+= NUMBER;
    }
    
    public String toString(){
        return String.format("sum = %d\n", sum);
    }
}
