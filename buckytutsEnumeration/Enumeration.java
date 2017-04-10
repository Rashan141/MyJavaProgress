/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buckytutsEnumeration;

/**
 *
 * @author rawhitta
 */
public enum Enumeration {
    bucky("nice", "22"),
    kelsey("cutie","10"),
    julia("big mistake","12"),
    nicole("Italian", "13"),
    candy("different","14"),
    erin("I wish", "16");
    
    //Enumeration, the above are constants, and must be recognized as such
    
    private final String desc;//We need just as many variables,
    private final String year;//as the chooices for constants
    
    Enumeration(String description, String birthday){ //
        desc = description;
        year = birthday;
    }
    
    public String getDesc(){return desc;}
    
    public String getYear(){return year;}
}
