/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buckytutsGUIStuff;

import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.*;

/**
 *
 * @author rawhitta
 */

public class GUIList extends JFrame{
    private JList jList;
    private static String[] colornames = {"black", "red", "blue", "white"};
    private static Color[] colors = {Color.BLACK, Color.BLUE, Color.RED, Color.WHITE};
    
    public GUIList(){
        super("Title Bar");
        setLayout(new FlowLayout());
        
        jList = new JList(colornames);
        jList.setVisibleRowCount(4);
        jList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); // Or use zero as an argument
        add(new JScrollPane(jList));
        
        jList.addListSelectionListener(
                new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent event) {
                getContentPane().setBackground(colors[jList.getSelectedIndex()]);
                }
            }
        );
    }
}
