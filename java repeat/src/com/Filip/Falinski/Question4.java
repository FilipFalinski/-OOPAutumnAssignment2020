package com.Filip.Falinski;

import javax.swing.*;

public class Question4 {
    public static void main (String[] args)
    {

        String s = "age";

        float memSize = Integer.parseInt(JOptionPane.showInputDialog("Enter Age"));
        try
        {

            int i = Integer.parseInt(s.trim());


            System.out.println("int i = " + i);
        }
        catch (NumberFormatException nfe)
        {
            System.out.println("NumberFormatException: " + nfe.getMessage());
        }
    }
}