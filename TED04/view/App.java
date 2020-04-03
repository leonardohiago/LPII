package view;

import model.Conta;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class App {

    public static void main(String[] args) {
        int op = 0;
        double saldoMaior = 0;
        int contaMaior = 0;
        String titularMaior = " ";

        ArrayList<Conta> conta = new ArrayList<>();

        while (op == 0) {

            int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da conta"));
            double saldo = Float.parseFloat(JOptionPane.showInputDialog("Digite o saldo da conta"));
            String nome = JOptionPane.showInputDialog("Digite o nome do titular da conta");

            Conta contas = new Conta(numero, saldo, nome);
            conta.add(contas);

            op = Integer.parseInt(JOptionPane.showInputDialog("Deseja realizar outro cadastro? \n0 - Sim\n1 - Não"));

        }

        for (Conta i: conta){
            if (saldoMaior < i.getSaldoConta()){
                saldoMaior = i.getSaldoConta();
                contaMaior = i.getNumeroConta();
                titularMaior = i.getNomeConta();
            }
        }
        JOptionPane.showMessageDialog(null, "A conta com maior saldo é:\nSaldo: " + saldoMaior + "\nConta: " + contaMaior + "\nTitular: " + titularMaior);
        JOptionPane.showMessageDialog(null, "Lista completa de contas cadastradas:\n" + conta);

    }
}
