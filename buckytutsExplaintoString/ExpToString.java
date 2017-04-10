/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buckytutsExplaintoString;

/**
 *
 * @author rawhitta
 */
public class ExpToString {
    private int month;
    private int day;
    private int year;
    
    public ExpToString(int m, int d, int y){
        month = ((m > 0 && m <13)? m : 12);
        day = ((d > 0 && d < 32)? d : 1);
        year = y;
        
        System.out.printf("The constructor for this is %s\n", this);
    }
    
    public String toString(){
        return String.format("%d/%d/%d", month, day, year);
    }
}
