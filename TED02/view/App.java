package view;

import model.Moldura;

import javax.swing.*;

public class App {

    public static void main (String[] args){

        float a1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a altura total do quadro"));
        float l1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a largura total do quadro"));
        float e1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a expessura total do quadro"));

        Moldura m = new Moldura(a1, l1, e1);
        JOptionPane.showMessageDialog(null, "A área do retângulo externo é: "+ m.calcAreaExterna() +" cm²"+
                "\nA área do retângulo interno é: "+ m.calcAreaInterna()+ " cm²" + "\nA área da moldura é: "+ m.calcAreaMoldura() + " cm²");
    }
}
