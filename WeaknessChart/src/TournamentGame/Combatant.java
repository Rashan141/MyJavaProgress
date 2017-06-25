/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TournamentGame;

import java.text.DecimalFormat;
import java.util.Random;

/**
 *
 * @author Rashan
 */
public class Combatant {
    private String personalType;
    private double  HP;
    private double MAX_HP;
    private double MIN_Atk, MAX_Atk;
    private int MIN_ACC;
    private final int MAX_ACC = 100;
    private double Def;
    private final double Crit = 1.30;
    private String name;
    private final Random randCalc = new Random();
    private boolean isDown = false;
    
    public Combatant(String name, String randomType){
        this.name = name;
        this.HP = round2(randCalc.nextInt(200) + 101, 1);
        this.MAX_HP = this.HP;
        this.MIN_Atk = round2(20.0/(this.HP/200), 1);
        this.personalType = randomType;
        this.MIN_ACC = (this.MIN_Atk <= 20 ? 75 : 90);
    }
    
    public Combatant(String name, String personalType, double HP, double Atk){
        this.name = name;
        this.HP = HP;
        this.MAX_HP = this.HP;
        this.MIN_Atk = Atk;
        this.personalType = personalType;
        this.MIN_ACC = (this.MIN_Atk <= 20 ? 75 : 90);
    }
    
    public void Attack(Combatant opponent) throws InterruptedException{
        System.out.println(this.name + " Attacks " + opponent.getName());
        double leftoverHealth = opponent.getHP() - HitWithCrit(this.getAtk(), this.Crit);
        
        
        System.out.println(this.name + " deals " + (opponent.getHP() - leftoverHealth) + " damage to " + opponent.getName());
        
        if(leftoverHealth <= 0){
            leftoverHealth = 0;
        }
        
        System.out.println(opponent.getName() + ": " + leftoverHealth + "/" + opponent.getMaxHP() + "HP \n");
        Thread.sleep(1000);
        opponent.setHP(leftoverHealth);
    }
    
    public void setType(String typeChosen){
        this.personalType = typeChosen;
    }
    
    public void setName(String chosenName){
        this.name = chosenName;
    }
    
    public void setHP(double healthPoints){
        this.HP = healthPoints;
    }
    
    public void setAtk(double Attack){
        this.MIN_Atk = Attack;
    }
    
    public String getType(){
        return this.personalType;
    }
    
    public String getName(){
        return this.name;
    }
    public double getHP(){
        return this.HP;
    }
    
    public double getMaxHP(){
        return this.MAX_HP;
    }
    public double getAtk(){
        return this.MIN_Atk;
    }
    public double getDef(){
        return this.Def;
    }
    
    public double getAcc(){
        return this.MIN_ACC;
    }
    
    public boolean knockedOut(){
        isDown = (this.HP <= 0);
        return this.isDown;
    }

    private double round2(double number, int scale) {
    int pow = 10;
    for (int i = 1; i < scale; i++)
        pow *= 10;
    double tmp = number * pow;
    double result = (double) (int) ((tmp - (int) tmp) >= 0.5f ? tmp + 1 : tmp) / pow;
    
    DecimalFormat twoDForm = new DecimalFormat("#.##");
    return Double.valueOf(twoDForm.format(result));
    }
    
    private double HitWithCrit(double Atk, double Critical){
        //10%
        double critChance = 0.10;
        double critAtk = (randCalc.nextDouble() <= 0.10 ? Atk * Critical : Atk);
        
        return critAtk;
    }
    
    private boolean HitOrMiss(double Accuracy){
        boolean verdict = true;
        
        return verdict;
    }
}
