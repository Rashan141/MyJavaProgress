/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TournamentGame;

import TournamentGame.Combatant;


/**
 *
 * @author Rashan
 */
abstract class CombatantBuilder {
    
    private String personalType;
    private double  HP;
    private double AtkPoints;
    private String name;
    
    protected Combatant combatant;
    
    public CombatantBuilder(){
    
    }
    
    public Combatant getCombatant() {
        return combatant;
    }

    public void createNewCombatant() {
        combatant = new Combatant(name, personalType, HP, AtkPoints);
    }

    public CombatantBuilder setHP(double Hp){
        this.HP = Hp;
        return this;
    }
    public CombatantBuilder setName(String name){
        this.name = name;
        return this;
    }
    public CombatantBuilder setAtk(double Attack){
        this.AtkPoints = Attack;
        return this;
    }
    public CombatantBuilder setType(String Type){
        this.personalType = (Type != "" ? Type : " ");
        return this;
    }
}
