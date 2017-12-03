/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TournamentGameUI;

import java.awt.FlowLayout;
import javax.swing.JPanel;
import javax.swing.*;
/**
 *
 * @author Rashan
 */
public class GamePanel extends JPanel {
    
        public JEditorPane leftOpp;
        public JEditorPane rightOpp;
        public JEditorPane battleDesc;
        
        public JButton yes;
        public JButton no;
        
        
    public GamePanel(){
        leftOpp.setLayout(new FlowLayout(LEFT_ALIGNMENT));
        add(leftOpp);
        
    }
}
