/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buckytutsEventHandler;

import javax.swing.JFrame;

/**
 *
 * @author rawhitta
 */

public class HandleIt {
    public static void main(String [] args){
        //ActionEventListener things
        Actiony eventObj = new Actiony();
        eventObj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        eventObj.setSize(300, 100);
        eventObj.setVisible(false);
        
        //MouseEventListerer things
        Mousey mice = new Mousey();
        mice.setDefaultCloseOperation(3);
        mice.setSize(300, 300);
        mice.setVisible(false);
        
        //Adapter things
        Adapted Adaptive = new Adapted();
        Adaptive.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Adaptive.setSize(300,300);
        Adaptive.setVisible(true);
    }
}
