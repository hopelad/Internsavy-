/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package currency_converter;

import java.awt.Color;
import static java.awt.Color.red;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author HoPeLaD
 */
public class Currency_converter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // To create JFrame that holds the others component
        JFrame f = new JFrame();
        f.setSize(600, 400);
        f.setTitle("Currency Converter");
        //TO create A place accept the input form the user.
        JLabel lb = new JLabel("Enter Amount");
        lb.setBounds(50, 100, 180, 30);
        Font fnt = lb.getFont();
        fnt = fnt.deriveFont(16f);
        lb.setFont(fnt);
        f.add(lb);

        JTextField inpt = new JTextField();
        inpt.setBounds(180, 100, 80, 30);
        inpt.setVisible(true);
        inpt.setBackground(Color.decode("#f7d7e3"));
        f.add(inpt);

        //For J table that shows the TOPIC of this tool.
        JLabel l = new JLabel("CURRENCY CONVERTER TOOL");
        l.setBackground(Color.red);
        l.setBounds(60, 10, 380, 100);
        Font font = l.getFont();
        font = font.deriveFont(24f);
        l.setFont(font);
        f.add(l);

        String[] options = {"USD", "EUR", "GBP", "JPY","INR"};

        // Create a JComboBox with the options
        JComboBox<String> fromdropdown = new JComboBox<>(options);
        fromdropdown.setBounds(90, 170, 90, 20);
        // Add the dropdown to the frame
        f.add(fromdropdown);
        JLabel from = new JLabel("FROM");
        from.setBounds(50, 170, 60, 20);
        f.add(from);

        //to 
        JComboBox<String> todropdown = new JComboBox<>(options);
        todropdown.setBounds(260, 170, 90, 20);
        f.add(todropdown);

        JLabel l3 = new JLabel("TO");
        l3.setBounds(230, 170, 60, 20);
        l3.setVisible(true);
        f.add(l3);
        //to add claculate buttn
        JButton calc = new JButton("Calculate");
        calc.setBounds(400, 165, 140, 30);
        calc.getFont();
        calc.setForeground(Color.black);
        calc.setBackground(Color.decode("#60e677"));
        f.add(calc);

        JTextArea otpt = new JTextArea("");
        otpt.setBounds(60, 250, 250, 40);
        otpt.getFont();
        otpt.setForeground(Color.black);
        otpt.setBackground(Color.decode("#f5edf0"));
        f.add(otpt);

        f.setLayout(null);
        f.setVisible(true);
        f.setResizable(true);
        f.setLocationRelativeTo(null);

        calc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                double amount = Double.parseDouble(inpt.getText());
                String fromdcurrency = (String) fromdropdown.getSelectedItem();
                String todcurrency = (String) todropdown.getSelectedItem();
//TO been done
                double convertedAmount = convertCurrency(amount, fromdcurrency, todcurrency);

                otpt.setText(String.format("> > >"+"%.2f %s = %.2f %s", amount, fromdcurrency, convertedAmount, todcurrency));
            }
            catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null, "Invalid Input!", "Error", JOptionPane.ERROR_MESSAGE);
                    otpt.setText("       Error !");
                    otpt.setBackground(red);
            }}

            private double convertCurrency(double amount, String fromdcurrency, String todcurrency) {
               double usdToEur = 0.92;
    double usdToGbp = 0.79;
    double usdToJpy = 144.31;
    double usdToInr = 82.10;

    double rateFrom = 1.0;
    double rateTo = 1.0;

    switch (fromdcurrency) {
        case "USD":
            rateFrom = 1.0;
            break;
        case "EUR":
            rateFrom = usdToEur;
            break;
        case "GBP":
            rateFrom = usdToGbp;
            break;
        case "JPY":
            rateFrom = usdToJpy;
            break;
        case "INR":
            rateFrom = usdToInr;
            break;
    }

    switch (todcurrency) {
        case "USD":
            rateTo = 1.0;
            break;
        case "EUR":
            rateTo = usdToEur;
            break;
        case "GBP":
            rateTo = usdToGbp;
            break;
        case "JPY":
            rateTo = usdToJpy;
            break;
        case "INR":
            rateTo = usdToInr;
            break;
    }

    return (amount / rateFrom) * rateTo;
}
            });

    }

}
