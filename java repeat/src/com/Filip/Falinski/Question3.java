package com.Filip.Falinski;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.*;
import javax.swing.border.Border;


public class Question3 extends JFrame  implements ActionListener {

    public Question3() {

        initUI();
    }

    private void initUI() {

        var quitButton = new JButton("Quit");

        quitButton.addActionListener((event) -> System.exit(0));

        createLayout(quitButton);

        setTitle("Quit ");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);


        JLabel label = new JLabel("Hello ");
        Border border = BorderFactory.createLineBorder(Color.BLACK);
        label.setBorder(border);
        label.setPreferredSize(new Dimension(50, 50));

        label.setText("Hello ");
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);

    }

    private void createLayout(JComponent... arg) {

        var pane = getContentPane();
        var gl = new GroupLayout(pane);
        pane.setLayout(gl);

        gl.setAutoCreateContainerGaps(true);

        gl.setHorizontalGroup(gl.createSequentialGroup()
                .addComponent(arg[0])
        );

        gl.setVerticalGroup(gl.createSequentialGroup()
                .addComponent(arg[0])
        );
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {

            var ex = new Question3();
            ex.setVisible(true);
        });
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

    }
}


//inheritance is when you can make a classes that are built on existing classes meaning that when a class inherits something form another class
//it can reuse that method. a subclass can inherit all the public and protected mehtods form the parent class but it cannot iherit private
//example would be.
// class Animal {
//        float weight;
//        ...
//        void eat() {
//            ...
//        }
//        ...
//    }
//
//    class Mammal extends Animal {
//        // inherits weight
//        int heartRate;
//        ...
//
//        // inherits eat()
//        void breathe() {

// a subclass can be further subclassed
//class Cat extends Mammal {
    // inherits weight and heartRate
   // boolean longHair;


    // inherits eat() and breathe()
    //void purr() {