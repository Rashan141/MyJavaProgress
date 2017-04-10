/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buckytutsfoodInherit;

import buckytutsfoodInherit.FoodOne;

/**
 *
 * @author rawhitta
 */
public class UseFood {
    public static void main(String [] args){
        FoodOne FO = new FoodOne();
        
       //FO.eat();// <-- Can't use due to being private in Foodie
       FO.iEat();
    }
}
