/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buckytutsStructs;

/**
 *
 * @author rawhitta
 */
public class UseMultiStruct {
        public static void main(String [] args){
          MultiStruct MSOBJ = new MultiStruct();
          MultiStruct MSOBJ2 = new MultiStruct(5);
          MultiStruct MSOBJ3 = new MultiStruct(5,13);
          MultiStruct MSOBJ4 = new MultiStruct(5,13,43);
          
          System.out.printf("%s\n", MSOBJ.toMilitary());
          System.out.printf("%s\n", MSOBJ2.toMilitary());
          System.out.printf("%s\n", MSOBJ3.toMilitary());
          System.out.printf("%s\n", MSOBJ4.toMilitary());
        }
}