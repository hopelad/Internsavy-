/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic_calculeter;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

/**
 *
 * @author HoPeLaD
 */
public class Basic_calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setSize(410, 500);
        f.setTitle("Basic Calculator");
        //TO create A place accept the input form the user.
        JTextArea inpt = new JTextArea();
        inpt.setBounds(180, 100, 90, 30);
        inpt.setVisible(true);
        inpt.setBackground(Color.decode("#f7d7e3"));
        f.add(inpt);
        
        JButton b0 = new JButton("0");
        b0.setBounds(100, 390, 60, 40);
        f.add(b0);
        
        JButton b1 = new JButton("1");
        b1.setBounds(30, 100, 60, 40);
        f.add(b1);
        
        JButton b2 = new JButton("2");
        b2.setBounds(40, 0, 60, 40);
        f.add(b2);
        
        JButton b3 = new JButton("3");
        b3.setBounds(40, 0, 60, 40);
        f.add(b3);
        
        JButton b4 = new JButton("4");
        b4.setBounds(40, 0, 60, 40);
        f.add(b4);
        
        JButton b5 = new JButton("5");
        b5.setBounds(40, 0, 60, 40);
        f.add(b5);
        
        JButton b6 = new JButton("6");
        b6.setBounds(40, 0, 60, 40);
        f.add(b6);
        
        JButton b7 = new JButton("7");
        b7.setBounds(40, 0, 60, 40);
        f.add(b7);
        
        JButton b8 = new JButton("8");
        b8.setBounds(40, 0, 60, 40);
        f.add(b8);
        
        JButton b9 = new JButton("9");
        b1.setBounds(40, 0, 60, 40);
        f.add(b9);
    
        JButton bdot = new JButton(".");
        bdot.setBounds(30, 390, 60, 40);
        f.add(bdot);
        
        JButton bminus = new JButton("-");
        bminus.setBounds(40, 0, 60, 40);
        f.add(bminus);
        
        JButton beql = new JButton("=");
        beql.setBounds(170, 380, 90, 50);
        f.add(beql);
        
        JButton bmult = new JButton("*");
        bmult.setBounds(40, 0, 60, 40);
        f.add(bmult);
        
        JButton bidiv = new JButton("/");
        bidiv.setBounds(40, 0, 60, 40);
        f.add(bidiv);
        
         JButton badd = new JButton("+");
        badd.setBounds(40, 0, 60, 40);
        f.add(badd);
        
         
        
        f.setLayout(null);
        f.setVisible(true);
        f.setResizable(true);
        f.setLocationRelativeTo(null);
    }
    
}
