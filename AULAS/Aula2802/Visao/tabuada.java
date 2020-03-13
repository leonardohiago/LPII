package Visao;

import javax.swing.*;

public class tabuada {

    public static void main(String[] args) {

        double valor;
        double resultado;
        char operacao = JOptionPane.showInputDialog("Digite a operação que deseja realizar (+ , - , * , / ").charAt(0);

        switch (operacao) {
            case '+':
                valor = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor que você quer gerar a tabuada"));
                for (int i = 1; i <11; i++) {
                    resultado = valor + i;
                    JOptionPane.showMessageDialog(null, valor + "*" + i + "=" + resultado);
                }
                break;

            case '-':
                valor = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor que você quer gerar a tabuada"));
                for (int i = 1; i <11; i++) {
                    resultado = valor - i;
                    JOptionPane.showMessageDialog(null, valor + "-" + i + "=" + resultado);
                }
                break;
            case '*':
                valor = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor que você quer gerar a tabuada"));
                for (int i = 1; i <11; i++) {
                    resultado = valor * i;
                    JOptionPane.showMessageDialog(null, valor + "*" + i + "=" + resultado);
                }
                break;
            case '/':
                valor = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor que você quer gerar a tabuada"));
                for (int i = 1; i <11; i++) {
                    resultado = valor / i;
                    JOptionPane.showMessageDialog(null, valor + "/" + i + "=" + resultado);
                }
                break;
        }
    }
}
