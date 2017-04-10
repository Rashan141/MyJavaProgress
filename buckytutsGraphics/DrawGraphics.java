/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buckytutsGraphics;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author rawhitta
 */
public class DrawGraphics {
    public static void main(String[] args){
        
        //Graphic Stuff
        JFrame f = new JFrame("Title");
        f.setDefaultCloseOperation(3);
        Graphic G = new Graphic();
        //f.add(G);
        f.setSize(400, 275);
        f.setVisible(true);
        
        //Color Choosing
        ColorChooser CC = new ColorChooser();
        CC.setDefaultCloseOperation(3);
        CC.setVisible(false);
        
        //More Shapes with Drawing
        MoreDrawing MD = new MoreDrawing();
        MD.setBackground(Color.WHITE);
        f.add(MD);
    }
}
