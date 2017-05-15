/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weaknesschart;

/**
 *
 * @author Rashan
 */
public class Combatant {
    private String personalType;
    private double  HP;
    private double Atk;
    private String name;
    private boolean isDown = false;
    
    public Combatant(String name, String personalType, double HP, double Atk){
        this.personalType = personalType;
        this.HP = HP;
        this.Atk = Atk;
        this.name = name;
    }
    
    public void Attack(Combatant opponent){
        System.out.println(this.name + " Attacks " + opponent.getName());
        double leftoverHealth = opponent.getHP() - this.getAtk();
        
        if(leftoverHealth < 0){
            leftoverHealth = 0;
        }
        
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
        this.Atk = Attack;
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
    public double getAtk(){
        return this.Atk;
    }
    
    public boolean knockedOut(){
        isDown = (this.HP <= 0);
        return this.isDown;
    }
}
