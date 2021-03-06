/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package weaknesschart;

import java.io.File;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Rashan
 */

public class WeaknessChart {
    private static final HashMap<String, HashMap<String, String>> types = new HashMap<>();
    private static final HashMap<String, String> fireEffects = new HashMap<>();
    private static final HashMap<String, String> waterEffects = new HashMap<>();
    private static final HashMap<String, String> grassEffects = new HashMap<>();
    
    private static final String[] keys = {"Fire", "Water", "Grass", "Wicked", "Magic"};
    private static Scanner eff;

    public static void main(String[] args) throws InterruptedException {
        ElementFill();
                
        types.put("Fire", fireEffects);
        types.put("Water", waterEffects);
        types.put("Grass", grassEffects);
    
        Combatant warrior1 = new Combatant("Player1","Fire",100.0,20.0);
        Combatant warrior2 = new Combatant("Player2","Water",100.0,20.0);
        
        BattleGround BG = new BattleGround(warrior1, warrior2);
    }
    
    public static void ElementFill(){

        String elementTitle, testedElement, result;
        
        try {eff=  new Scanner(new File("C:\\Users\\Rashan\\Documents\\NetBeansProjects\\WeaknessChart\\src\\weaknesschart\\Effective.txt"));}
        catch(Exception e){
            System.out.print(e);
        }
        
        while (eff.hasNext()){
                elementTitle = eff.next();
                
                switch (elementTitle) {
                case "Fire":
                    for (int g = 0; g < 3; g++){
                        testedElement = eff.next();
                        result = eff.next();        
                        fireEffects.put(testedElement, result);
                    }
                    break;
                case "Water":
                    for (int g = 0; g < 3; g++){
                        testedElement = eff.next();
                        result = eff.next();
                        waterEffects.put(testedElement, result);
                }
                    break;
                case "Grass":
                    for (int g = 0; g < 3; g++){
                        testedElement = eff.next();
                        result = eff.next();
                        grassEffects.put(testedElement, result);
                }
                    break;
                default:
                    break;
            }
        }
        
//        System.out.println(fireEffects.size());
//        System.out.println(grassEffects.size());
//        System.out.println(waterEffects.size());
        
        eff.close();
    }
}
