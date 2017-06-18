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
public class BattleGround {
    
    public BattleGround(Combatant first, Combatant second) throws InterruptedException{
        Winner(Fight(first, second));
    }
    
    public final Combatant Fight(Combatant first, Combatant second) throws InterruptedException{
        Combatant victor = null;
        
        while(first.knockedOut() != true && second.knockedOut() != true){
            first.Attack(second);
            
            if(second.knockedOut())
                break;
            
            second.Attack(first);
        }
        
        if(first.knockedOut() == false && second.knockedOut() == true)
            victor = first;
        else
            victor = second;
        
        return victor;
    }
    
    public final void Winner(Combatant living){
        System.out.println(living.getName() + " is the Winner!");
    }
}
