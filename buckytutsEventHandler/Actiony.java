/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buckytutsEventHandler;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

/*@author rawhitta*/

public class Actiony extends JFrame{
    private JTextField field1;
    private JTextField field2;
    private JTextField field3;
    private JPasswordField passWord;
    
    public Actiony(){
        super("TITLE BAR");
        
        setLayout(new FlowLayout());
        
        field1 = new JTextField(10);
        add(field1);
        
        field2 = new JTextField("Enter Text Here: ");
        add(field2);
        
        field3 = new JTextField("UnEditable", 20);
        field3.setEditable(false);
        add(field3);
        
        passWord = new JPasswordField("Password");
        add(passWord);
        
        TheHandler handler = new TheHandler();
        field1.addActionListener(handler);
        field2.addActionListener(handler);
        field3.addActionListener(handler);
        passWord.addActionListener(handler);
    }
    
    private class TheHandler implements ActionListener{
        
        @Override
        public void actionPerformed(ActionEvent event){
            
            String string = " ";
           
            if (event.getSource() == field1)
                string = String.format("field 1: %s", event.getActionCommand());
            else if (event.getSource() == field2)
                string = String.format("field 2: %s", event.getActionCommand());
            else if (event.getSource() == field3)
                string = String.format("field 3: %s", event.getActionCommand());
            else if (event.getSource() == passWord)
                string = String.format("Password Field is: %s", event.getActionCommand());
            
            JOptionPane.showMessageDialog(null, string);
        }
        
    }
}
