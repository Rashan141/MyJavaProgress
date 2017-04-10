/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buckytutsFileClass;

/**
 *
 * @author rawhitta
 */
public class FileThings {
     public static void main(String [] args){
         
         //Creates a new file every time it's called, and fills it
         /*FileFiller FF = new FileFiller();
         FF.openFile();
         FF.addRecords();
         FF.closeFile();*/
         
         //Reading from a file
         FileReader FR = new FileReader();
         FR.openFile();
         FR.readFile();
         FR.closeFile();
     }
}
