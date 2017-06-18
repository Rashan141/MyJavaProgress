/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package weaknesschart;

import java.io.File;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Random;
import javax.swing.*;

/**
 *
 * @author Rashan
 */

public class TournamentGame {
    
    private static final HashMap<String, HashMap<String, String>> types = new HashMap<>();
    private static final HashMap<String, String> fireEffects = new HashMap<>();
    private static final HashMap<String, String> waterEffects = new HashMap<>();
    private static final HashMap<String, String> grassEffects = new HashMap<>();
    
    private static final String[] keys = {"Fire", "Water", "Grass", "Wicked", "Magic"};
    private static Scanner eff;

    public static void main(String[] args) throws InterruptedException {
        ElementEffectFill();
                
        types.put("Fire", fireEffects);
        types.put("Water", waterEffects);
        types.put("Grass", grassEffects);
    
        Combatant warrior1 = new Combatant("Player1","Fire",100.0,20.0);
        Combatant warrior2 = new Combatant("Player2","Water",140.0,20.0);
        Combatant randieChar = null;
        
        randieChar = CallRandomFighter(randieChar);
        CheckStats(randieChar);
        
        System.out.println();
        
        BattleGround BG = new BattleGround(warrior1, warrior2);
    }
    
    public static void ElementEffectFill(){

        String elementTitle, testedElement, elementAffectedResult;
        
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
                        elementAffectedResult = eff.next();        
                        fireEffects.put(testedElement, elementAffectedResult);
                    }
                    break;
                case "Water":
                    for (int g = 0; g < 3; g++){
                        testedElement = eff.next();
                        elementAffectedResult = eff.next();
                        waterEffects.put(testedElement, elementAffectedResult);
                }
                    break;
                case "Grass":
                    for (int g = 0; g < 3; g++){
                        testedElement = eff.next();
                        elementAffectedResult = eff.next();
                        grassEffects.put(testedElement, elementAffectedResult);
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

    public static Combatant CallRandomFighter(Combatant k){
        Random randTypeChoice = new Random();
        int randType = randTypeChoice.nextInt(keys.length);
        
        k = new Combatant("random", keys[randType]);
        
        return k;
    }
    
    public static void CheckStats(Combatant fighterToBeChecked){
        System.out.printf("Name:%s \n HP:%f \n Attack:%f \n Type:%s \n", fighterToBeChecked.getName(), 
                fighterToBeChecked.getHP(), fighterToBeChecked.getAtk(), fighterToBeChecked.getType());
    }
}
