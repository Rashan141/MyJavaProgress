/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buckytutsEventHandler;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author rawhitta
 */
public class Adapted extends JFrame{
    private String details;
    private JLabel statusBar;
    
    public Adapted(){
        super("Adaptive");
        
        statusBar = new JLabel("Thus is default");
        add(statusBar, BorderLayout.SOUTH);
        addMouseListener(new MouseClass());
    }
    
    private class MouseClass extends MouseAdapter{
        public void mouseClicked(MouseEvent event){
            details = String.format("You clicked %d ", event.getClickCount());
            
            if(event.isMetaDown()){
                details += "with right mouse button";
            }
            else if(event.isAltDown())
                details += "with center mouse button";
            else
                details += "with left mouse button";
            
            statusBar.setText(details);
        }
    }
}
