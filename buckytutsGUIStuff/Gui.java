/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buckytutsGUIStuff;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author rawhitta
 */

public class Gui extends JFrame{
    private JButton reg;
    private JButton custom;
    
    public Gui(){
        super("The Title");
        setLayout(new FlowLayout());
        
        reg = new JButton("reg Button");
        add(reg);
        
        Icon candy = new ImageIcon(getClass().getResource("candy.png"));
        Icon donut = new ImageIcon(getClass().getResource("donut.png"));
        
        custom = new JButton("Custom", candy);
        custom.setRolloverIcon(donut);
        add(custom);
        
        HandlerClass handler = new HandlerClass();
        
        reg.addActionListener(handler);
        custom.addActionListener(handler);
            
        }
    
        private class HandlerClass implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent event) {
            JOptionPane.showMessageDialog(null, String.format
                        ("%s", event.getActionCommand()));
        }
    }
}

