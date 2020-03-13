package view;

import model.Circulo;

import javax.swing.*;

public class App {

    public static void main (String[] args) {

        Circulo c1 = new Circulo(9);
        JOptionPane.showMessageDialog(null,"A área do círculo é: " + c1.calcArea());

    }
}
