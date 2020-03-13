import javax.swing.*;
/**
 2. Faça um programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês, sabendo-se que são descontados 11%
 para o Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça um programa que nos dê:

 a. salário bruto.
 b. quanto pagou ao IPRF
 c. quanto pagou ao INSS.
 d. quanto pagou ao sindicato.
 e. o salário líquido.
 f. o valor descontado.

 **/
public class TED02 {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Responda as perguntas e veja qual é o seu salário");
        double ganhaHora = Double.parseDouble(JOptionPane.showInputDialog("Quanto você ganha por hora?"));
        double numeroHora = Double.parseDouble(JOptionPane.showInputDialog("Quantas horas você trabalha por mês"));

        double salarioBruto = ganhaHora * numeroHora;
        double irpf = (salarioBruto * 11)/100;
        double inss = (salarioBruto * 8)/100;
        double sindicato = (salarioBruto * 5)/100;
        double desconto = irpf+inss+sindicato;

        JOptionPane.showMessageDialog(null, "Salário Bruto: R$"+salarioBruto + "\n Valor pago IRPF: R$"+irpf + "\n Valor pago INSS: R$" +inss +"\n Valor pago Sindicato: R$" +sindicato
        +"\n Salário Líquido: R$:" +(salarioBruto - (irpf+inss+sindicato))+ "\n Valor total descontado: R$"+desconto);
    }
}
