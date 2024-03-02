/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.resortpricecalculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

/**
 *
 * @author vygir
 */
public class CalculatorFrame extends JFrame {

    private JTextField nameField;
    private JCheckBox breakfast, goft, pool;
    private JComboBox percent;
    private JLabel title, note1, note2;
    private JButton Calculate;

    public CalculatorFrame() {
        setTitle("This is my First Frame");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        JPanel mainPanel = new JPanel(new BorderLayout());

        JPanel input = new JPanel(new GridLayout(7, 1, 5, 5));

        JPanel inputPanel = new JPanel(new GridLayout(2, 1, 5, 5));

        JPanel name = new JPanel(new GridLayout(1, 2, 5, 5));
        JPanel checkbox = new JPanel(new GridLayout(1, 3, 5, 5));
        JPanel last = new JPanel(new GridLayout(1, 2, 5, 5));

        Calculate = new JButton("Calculate");
        final JLabel tf = new JLabel("");
        Calculate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double total = 200;
                if(breakfast.isSelected()){
                    total+=20;
                }
                if(goft.isSelected()){
                    total+=50;
                }
                if(pool.isSelected()){
                    total+=15;
                }
                if(percent.getItemAt(percent.getSelectedIndex()).equals("Weekend (+30%)")){
                    total = total*130/100;
                }
                if(percent.getItemAt(percent.getSelectedIndex()).equals("Week day (-10%)")){
                    total = total*90/100;
                }
                
                tf.setText("Hello "+nameField.getText()+" Your payment is: "+total);
            }
        });
        String obj[] = {"Weekend (+30%)", "Week day (-10%)"};
        percent = new JComboBox(obj);
        JLabel title = new JLabel("Resort Price Calculator");
        title.setHorizontalAlignment((int) CENTER_ALIGNMENT);
        JLabel note1 = new JLabel("Base price for a room is $200");
        note1.setHorizontalAlignment((int) CENTER_ALIGNMENT);
        note1.setSize(5, 5);
        JLabel note2 = new JLabel("Choose option that you want");
        note2.setHorizontalAlignment((int) CENTER_ALIGNMENT);
        note2.setSize(5, 5);
        nameField = new JTextField();
        breakfast = new JCheckBox("Breakfast $20");
        goft = new JCheckBox("Goft $50");
        pool = new JCheckBox("Pool $15");

        name.add(new JLabel("Guest name "));
        name.add(nameField);

        checkbox.add(breakfast);
        checkbox.add(goft);
        checkbox.add(pool);

        last.add(percent);
        last.add(Calculate);

        input.add(note1);
        input.add(note2);
        input.add(name);
        input.add(checkbox);
        input.add(last);
        input.add(tf);

        inputPanel.add(title);
        inputPanel.add(input);

        mainPanel.add(inputPanel, BorderLayout.NORTH);

        add(mainPanel);
        setVisible(true);

    }

}
