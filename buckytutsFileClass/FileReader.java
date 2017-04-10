/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buckytutsFileClass;

import java.io.*;
import java.util.*;

/**
 *
 * @author rawhitta
 */
public class FileReader {
    private Scanner x;
    
    public void openFile(){
        try
        {x = new Scanner(new File("Asia.txt"));}
        catch (Exception e){ System.out.println("Could not find file.");}
    }
    
    public void readFile(){
        while(x.hasNext()){
            System.out.println(x.nextLine());
        }
    }
    
    public void closeFile(){
        x.close();
    }
}
