/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buckytutsGUIStuff;


import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
import javax.swing.*;

/**
 *
 * @author rawhitta
 */
public class MultiSel extends JFrame{
    private JList leftList;
    private JList rightList;
    private JButton moveButton;
    private static String[] foods = {"bacon", "wings", "ham", "beef", "morebacon"};
    
    public MultiSel(){
        super("Superb Food Choices");
        setLayout(new FlowLayout());
        
        leftList = new JList(foods);
        leftList.setVisibleRowCount(3);
        leftList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        add(new JScrollPane(leftList));
        
        moveButton = new JButton("Move ->");
        moveButton.addActionListener(
                new ActionListener(){
                    
                    @Override
                    public void actionPerformed(ActionEvent event){
                        rightList.setListData(leftList.getSelectedValuesList().toArray());
                    }
                }                
        );
        
        add(moveButton);
        
        rightList = new JList();
        rightList.setVisibleRowCount(3);
        rightList.setFixedCellHeight(20);
        rightList.setFixedCellWidth(100);
        rightList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        
        add(new JScrollPane(rightList));
    }

}
