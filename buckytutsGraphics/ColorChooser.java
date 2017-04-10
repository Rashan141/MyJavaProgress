/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buckytutsGraphics;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author rawhitta
 */

public class ColorChooser extends JFrame{
    private JButton button;
    private Color color = (Color.WHITE);
    private JPanel panel;
    
    public ColorChooser(){
        super("Pick Your Favorite!");
        panel = new JPanel();
        panel.setBackground(color);
        
        button = new JButton("Choose a color");
        button.addActionListener(
                new ActionListener(){
                public void actionPerformed(ActionEvent event){
                    color = JColorChooser.showDialog(null, "Pick your color", color);
                    if(color == null)
                        color = (Color.WHITE);
                    
                    panel.setBackground(color);
                }
                    
                }
        
        );
        add(panel, BorderLayout.CENTER);
        add(button, BorderLayout.SOUTH);
        setSize(425, 150);
    }
}
