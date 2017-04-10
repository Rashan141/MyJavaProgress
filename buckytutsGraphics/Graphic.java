/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buckytutsGraphics;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author rawhitta
 */

public class Graphic extends JPanel{
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        this.setBackground(Color.WHITE);
        
        g.setColor(Color.BLUE);
        g.fillRect(25, 25, 100, 30);
        
        g.setColor(new Color(190,81,215));
        g.fillRect(25, 65, 100, 30);
        
        g.setColor(Color.RED);
        g.drawString("This is some text", 25, 120);
    }
    
    
}
