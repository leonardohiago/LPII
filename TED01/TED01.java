import javax.swing.*;
/**
 1. Faça um programa em Java, que resolva uma equação de 2o grau (ax2+bx+c = 0). O usuário deve digitar os valores de a, b e c.
 Para isso, implemente a entrada de dados com Scanner ou JOptionPane.

 **/
public class TED01 {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Digite os valores de a, b e c para realizar a operação ax²+bx+c!");
        double a = Double.parseDouble(JOptionPane.showInputDialog("Digite o primiero valor da operação"));
        while (a == 0) {
            a = Double.parseDouble(JOptionPane.showInputDialog("Valor inválido!\nDigite o primiero valor da operação novamente"));
        }
        double b = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor da operação"));
        double c = Double.parseDouble(JOptionPane.showInputDialog("Digite o terceiro valor da operação"));

        double delta = (Math.pow(b, 2) - 4*a*c);
        double equacao1 = (-b + Math.sqrt(delta))/(2*a);
        double equacao2 = (-b - Math.sqrt(delta))/(2*a);

        if (!Double.isNaN(equacao1) && !Double.isNaN(equacao2)) {
            String result1 = String.format("%.2f", equacao1);
            String result2 = String.format("%.2f", equacao2);
            JOptionPane.showMessageDialog(null, "O valor da equação x' = " + result1 + " e o valor da equação x'' = " + result2);
        } else {
            JOptionPane.showMessageDialog(null, "Não possui raiz válida");
        }
    }

}

