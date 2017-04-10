/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buckytutsGUIStuff;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author rawhitta
 */
public class GUICheckBox extends JFrame{
    private JTextField tf;
    private JCheckBox boldBox;
    private JCheckBox italicBox;
    
    public GUICheckBox(){
        super("Title");
        setLayout(new FlowLayout());
        
        tf = new JTextField("This is a sentence", 20);
        tf.setFont(new Font("Serif", Font.PLAIN, 14));
        add(tf);
        
        boldBox = new JCheckBox("Bold");
        italicBox = new JCheckBox("Italic");
        
        add(boldBox);
        add(italicBox);
        
        HandlerClass handler = new HandlerClass();
        
        boldBox.addItemListener(handler);
        italicBox.addItemListener(handler);
    }
    
    private class HandlerClass implements ItemListener{
        @Override
        public void itemStateChanged(ItemEvent event) {
            Font font = null;
            
            if (boldBox.isSelected() && italicBox.isSelected())
                font = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
            else if (boldBox.isSelected())
                font = new Font("Serif", Font.BOLD, 14);
            else if (italicBox.isSelected())
                font = new Font("Serif", Font.ITALIC, 14);
            else
                font = new Font("Serif", Font.PLAIN, 14);
            
            tf.setFont(font);
        }
    
    }
}
