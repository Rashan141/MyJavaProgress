/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package weaknesschart;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Rashan
 */

public class WeaknessChart {
    private static HashMap<String, HashMap<String, String>> types;
    private static HashMap<String, String> fireEffects;
    private static HashMap<String, String> waterEffects;
    private static HashMap<String, String> grassEffects;
    private static Scanner eff;

    public static void main(String[] args) {

            ElementFill();
                
        types.put("Fire", fireEffects);
        types.put("Water", waterEffects);
        types.put("Grass", grassEffects);
    }
    
    public static void ElementFill(){

        String elementTitle, testedElement, result;
        
        try {eff=  new Scanner(new File("C:\\Users\\Rashan\\Documents\\NetBeansProjects\\WeaknessChart\\src\\weaknesschart\\Effective.txt"));}
        catch(Exception e){
            System.out.print(e);
        }
        
        while (eff.hasNext()){
                elementTitle = eff.next();
                testedElement = eff.next();
                result = eff.next();
                System.out.println(elementTitle + " " + testedElement + " " + result);
                switch (elementTitle) {
                case "Fire":
                    for (int g = 0; g < 18; g++){
                        fireEffects.put(testedElement, result);
                        testedElement = eff.next();
                        result = eff.next();
                    }
                    break;
                case "Water":
                    for (int g = 0; g < 18; g++){
                        waterEffects.put(testedElement, result);
                }
                    break;
                case "Grass":
                    for (int g = 0; g < 18; g++){
                        grassEffects.put(testedElement, result);
                }
                    break;
                default:
                    break;
            }
        }
        
        eff.close();
    }
}
