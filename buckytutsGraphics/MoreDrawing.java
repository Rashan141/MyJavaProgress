/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buckytutsGraphics;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author rawhitta
 */
public class MoreDrawing extends JPanel{
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        this.setBackground(Color.WHITE);
        
        g.setColor(Color.BLUE);
        g.drawLine(10, 25, 200, 45);
        
        g.setColor(Color.RED);
        g.drawRect(10, 55, 100, 30);
        
        g.setColor(Color.GREEN);
        g.fillOval(10, 95, 100, 30);
        
        g.setColor(Color.ORANGE);
        g.fill3DRect(10, 160, 100, 50, true);
    }
}
