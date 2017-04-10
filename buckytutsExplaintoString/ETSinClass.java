/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buckytutsExplaintoString;

import buckytutsExplaintoString.ExpToString;

/**
 *
 * @author rawhitta
 */
public class ETSinClass {
    private String name;
    private ExpToString birthday;
    
    public ETSinClass(String theName, ExpToString theDate){
        name = theName;
        birthday = theDate;
    }
    
    public String toString(){
        return String.format("My name is %s, my birthday is %s", name, birthday);
    }
}
