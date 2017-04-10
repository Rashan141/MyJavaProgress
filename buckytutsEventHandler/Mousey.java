/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buckytutsEventHandler;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



/**
 *
 * @author rawhitta
 */

public class Mousey extends JFrame {
    private JPanel mousePanel;
    private JLabel statusBar;
    
    public Mousey(){
        super("Mouse will listen");
        
        mousePanel = new JPanel();
        mousePanel.setBackground(Color.white);
        add(mousePanel, BorderLayout.CENTER);
        
        statusBar = new JLabel("default");
        add(statusBar, BorderLayout.SOUTH);
        
        HandlerClass handler = new HandlerClass();
        mousePanel.addMouseListener(handler);
        mousePanel.addMouseMotionListener(handler);       
    }
    
    private class HandlerClass implements MouseListener, MouseMotionListener{
        @Override
        public void mouseClicked(MouseEvent event){
            statusBar.setText(String.format("Clicked at %d,%d", event.getX(),event.getY()));
        }
        
        @Override
        public void mousePressed(MouseEvent event){
            statusBar.setText("You pressed down the mouse");
        }
        
        @Override
        public void mouseReleased(MouseEvent event){
            statusBar.setText("You released the mouse button");
        }
        
        @Override
        public void mouseEntered(MouseEvent event){
            statusBar.setText("You entered the area.");
            mousePanel.setBackground(Color.red);
        }
        
        @Override
        public void mouseExited(MouseEvent event){
            statusBar.setText("You exited the area.");
            mousePanel.setBackground(Color.white);
        }
        
        //These are MouseMotionListener Events
        @Override
        public void mouseDragged(MouseEvent event) {
            statusBar.setText("You are dragging the mouse");
        }

        @Override
        public void mouseMoved(MouseEvent event) {
            statusBar.setText("You are moving the mouse.");
        }
        
    }
}
