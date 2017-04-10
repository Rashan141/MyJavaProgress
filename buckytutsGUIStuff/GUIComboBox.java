/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buckytutsGUIStuff;

import java.awt.FlowLayout;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.Icon;
import javax.swing.ImageIcon;
/**
 *
 * @author rawhitta
 */
public class GUIComboBox extends JFrame{ // Basically a drop down box.
    private JComboBox CBbox;
    private JLabel picture;
    
    private static String [] filename = {"candy.png", "donut.png"};
    private Icon[] pics = {new ImageIcon(getClass().getResource(filename[0])), new ImageIcon(getClass().getResource(filename[1]))};

    public GUIComboBox(){
        super("title");
        setLayout(new FlowLayout());
        
        CBbox = new JComboBox(filename);
        
        CBbox.addItemListener(
                new ItemListener(){
            @Override
            public void itemStateChanged(ItemEvent event) {
               if(event.getStateChange() == ItemEvent.SELECTED)
                   picture.setIcon(pics[CBbox.getSelectedIndex()]);
                }
            }
        );
        
        add(CBbox);
        picture = new JLabel(pics[0]);
        add(picture);
    }
}
