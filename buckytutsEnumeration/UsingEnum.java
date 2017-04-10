/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buckytutsEnumeration;
import buckytutsEnumeration.Enumeration;
import java.util.EnumSet;

/**
 *
 * @author rawhitta
 */
public class UsingEnum {
    public static void main(String [] args){
        for (Enumeration base: Enumeration.values())
            System.out.printf("%s\t%s\t%s\n", base, base.getDesc(), base.getYear());
        
        System.out.println("\n And now of the range of constants!!!!\n");
        
        
        for(Enumeration dally: EnumSet.range(Enumeration.kelsey, Enumeration.candy))
            System.out.printf("%s\t%s\t%s\n", dally, dally.getDesc(), dally.getYear());
        
    }
}
