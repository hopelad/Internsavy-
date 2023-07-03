/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task_1;

/**
 *
 * @author HoPeLaD
 */
import java.awt.Color;
import static java.awt.Color.red;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class TASK_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // To create JFrame that holds the others component
        JFrame f = new JFrame();
        f.setSize(400, 400);
        f.setTitle("TemperatureConverter");
        //TO create A place accept the input form the user.
        JLabel lb = new JLabel("Enter Temperature");
        lb.setBounds(50, 100, 150, 30);
        Font fnt = lb.getFont();
        fnt = fnt.deriveFont(13f);
        lb.setFont(fnt);
        f.add(lb);

        JTextArea inpt = new JTextArea();
        inpt.setBounds(180, 100, 90, 30);
        inpt.setVisible(true);
        inpt.setBackground(Color.decode("#f7d7e3"));
        f.add(inpt);

        //For J table that shows the TOPIC of this tool.
        JLabel l = new JLabel("TEMPERATURE CONVERSSION TOOL");
        l.setBackground(Color.red);
        l.setBounds(30, 20, 340, 100);
        Font font = l.getFont();
        font = font.deriveFont(18f);
        l.setFont(font);
        f.add(l);
        //To compute we need to add Button for Fahrenheit to Celsius
        JButton FtoC = new JButton("Fahrenheit to Celsius");
        FtoC.setBounds(100, 150, 160, 30);
        FtoC.getFont();
        FtoC.setForeground(Color.black);
        FtoC.setBackground(Color.decode("#60e677"));
        f.add(FtoC);

        //To compute we need to add Button for Celsius to Fahrenheit
        JButton CtoF = new JButton("Celsius to Fahrenheit");
        CtoF.setBounds(100, 200, 160, 30);
        CtoF.getFont();
        CtoF.setForeground(Color.black);
        CtoF.setBackground(Color.decode("#60e677"));
        f.add(CtoF);

        //To give Output for User
        JTextArea otpt = new JTextArea("");
        otpt.setBounds(60, 250, 250, 65);
        otpt.getFont();
        otpt.setForeground(Color.black);
        otpt.setBackground(Color.decode("#f5edf0"));
        otpt.setText("   Temperature conversion tool\n"
                + " That allow users to convert temperature\n"
                + " From Fahrenheit to Celsius and Vice\n"
                + " Versa.");
        f.add(otpt);

        f.setLayout(null);
        f.setVisible(true);
        f.setResizable(true);
        f.setLocationRelativeTo(null);

        // to perform calculation for Celsius to Fahrenheit
        CtoF.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Code to handle button click
                String inputValue = inpt.getText();
                double inputTemp;
                try {
                    inputTemp = Double.parseDouble(inputValue);
                    double Ctof = (inputTemp - 32) * 5 / 9;
                    String text = Double.toString(Ctof);
                    otpt.setText("    \n " + inputValue + "°C is equal to " + text + "°F");
                    otpt.setBackground(Color.decode("#d0d1c9"));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Invalid temperature value!", "Error", JOptionPane.ERROR_MESSAGE);
                    otpt.setText("       Error !");
                    otpt.setBackground(red);
                    return;

                }
            }
        });

        // to perform calculation for  Fahrenheitto Celsius to Fahrenheit
        FtoC.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Code to handle button click
                String inputValue = inpt.getText();
                double celsius;
                try {
                    celsius = Double.parseDouble(inputValue);
                    double FtoC = (celsius * 9 / 5) + 32;
                    String text = Double.toString(FtoC);
                    otpt.setText("    \n " + inputValue + "°F is equal to " + text + "°C");
                    otpt.setBackground(Color.decode("#d0d1c9"));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Invalid temperature value!", "Error", JOptionPane.ERROR_MESSAGE);
                    otpt.setText("       Error !");
                    otpt.setBackground(red);
                    return;
                }
            }
        });

    }

}
