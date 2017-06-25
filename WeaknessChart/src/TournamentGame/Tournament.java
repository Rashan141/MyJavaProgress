/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TournamentGame;

import java.io.File;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Rashan
 */

public class Tournament {
    
    public static final HashMap<String, HashMap<String, String>> types = new HashMap<>();
    private static final HashMap<String, String> fireEffects = new HashMap<>();
    private static final HashMap<String, String> waterEffects = new HashMap<>();
    private static final HashMap<String, String> grassEffects = new HashMap<>();
    
    public static final String[] keys = {"Fire", "Water", "Grass", "Wicked", "Magic"};
    private static Scanner fillEffectsScanner, tournamentScanner;

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
        
        try {fillEffectsScanner=  new Scanner(new File("C:\\Users\\Rashan\\Documents\\NetBeansProjects\\WeaknessChart\\src\\weaknesschart\\Effective.txt"));}
        catch(Exception e){
            System.out.print(e);
        }
        
        while (fillEffectsScanner.hasNext()){
                elementTitle = fillEffectsScanner.next();
                
                switch (elementTitle) {
                case "Fire":
                    for (int g = 0; g < 3; g++){
                        testedElement = fillEffectsScanner.next();
                        elementAffectedResult = fillEffectsScanner.next();        
                        fireEffects.put(testedElement, elementAffectedResult);
                    }
                    break;
                case "Water":
                    for (int g = 0; g < 3; g++){
                        testedElement = fillEffectsScanner.next();
                        elementAffectedResult = fillEffectsScanner.next();
                        waterEffects.put(testedElement, elementAffectedResult);
                }
                    break;
                case "Grass":
                    for (int g = 0; g < 3; g++){
                        testedElement = fillEffectsScanner.next();
                        elementAffectedResult = fillEffectsScanner.next();
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
        
        fillEffectsScanner.close();
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
    
    public static void TournamentHistory(){
        try {tournamentScanner=  new Scanner(new File("C:\\Users\\Rashan\\Documents\\NetBeansProjects\\WeaknessChart"
                + "\\src\\weaknesschart\\TournamentHistoryandResults.txt"));}
        catch(Exception e){
            System.out.print(e);
        }
        
    }
    
    public static void TournamentResults(){
        
    }
    
    public static void ViewCombatantList(){
        
    }
    
    public static void AddToCombatantList(){
        
    }
    
    
}
