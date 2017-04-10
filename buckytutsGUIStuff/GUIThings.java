/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buckytutsGUIStuff;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

/* @author rawhitta */

public class GUIThings extends JFrame{
    
        private JLabel item1;
        
        public GUIThings(){
            super("Title Bar");
            setLayout(new FlowLayout());
            
            item1 = new JLabel("This is a sentence");
            item1.setToolTipText("This is gonna show up on hover.");
            add(item1);
        }
    
}
