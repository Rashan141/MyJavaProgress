/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TournamentGameUI;

import javax.swing.JFrame;

/**
 *
 * @author Rashan
 */
public class GameFrameUI extends JFrame{
    
    GamePanel gamePanel;
    
    public GameFrameUI(){
        
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(500, 400);
        add(gamePanel);
        this.setVisible(true);
    }
    
    
}
