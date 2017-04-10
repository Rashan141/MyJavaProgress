/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buckytutsGUIStuff;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author rawhitta
 */
public class GUIRadioButtons extends JFrame {
    private JRadioButton plainButton;
    private JRadioButton boldButton;
    private JRadioButton boldItalButton;
    private JRadioButton italicButton;
    private JTextField tf;
    private Font plainFont;
    private Font boldFont;
    private Font italicFont;
    private Font boldItalFont;
    private ButtonGroup group;
    
    public GUIRadioButtons(){
        super("Title");
        setLayout(new FlowLayout());
        
        tf = new JTextField("We're dealing with Radios....Buttons", 25);
        add(tf);
        
        //Make sure to set only one of these to true, rest false
        plainButton = new JRadioButton("Plain", true);
        boldButton = new JRadioButton("Bold", false);
        italicButton = new JRadioButton("Italic", false);
        boldItalButton = new JRadioButton("Bold & Italic", false);
        
        add(plainButton);
        add(boldButton);
        add(italicButton);
        add(boldItalButton);
        
        group = new ButtonGroup();
        group.add(plainButton);
        group.add(boldButton);
        group.add(italicButton);
        group.add(boldItalButton);
        
        plainFont = new Font("Serif", Font.PLAIN, 14);
        boldFont = new Font("Serif", Font.BOLD, 14);
        italicFont = new Font("Serif", Font.ITALIC, 14);
        boldItalFont = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
        tf.setFont(plainFont);
        
        plainButton.addItemListener(new HandlerClass(plainFont));
        boldButton.addItemListener(new HandlerClass(boldFont));
        italicButton.addItemListener(new HandlerClass(italicFont));
        boldItalButton.addItemListener(new HandlerClass(boldItalFont));
    }
    
    private class HandlerClass implements ItemListener {
        private Font font;
        
        //The font object get variable font
        public HandlerClass(Font f){
            font = f;
        }
        
        //sets the font to the Font object, that was passed in
        @Override
        public void itemStateChanged(ItemEvent ie) {
            tf.setFont(font);
        }
    }
}
