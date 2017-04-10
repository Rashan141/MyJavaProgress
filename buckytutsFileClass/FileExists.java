/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buckytutsFileClass;

import java.io.File;

/**
 *
 * @author rawhitta
 */

public class FileExists {
    public static void main(String [] args){
        
         //It has to be the whole address
        File x = new File("C:\\Users\\rawhitta\\Documents\\NetBeansProjects\\BuckyTutorials\\greg.txt");
        
        if (x.exists())
            System.out.println(x.getName() + " Exists");
        else
            System.out.println("This thing doesn't exist.");
    }
}
