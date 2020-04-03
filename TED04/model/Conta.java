package model;

public class Conta {

    private int numero;
    private double saldo;
    private String nome; //extra

    public Conta (int nU, double s, String nO) {
        this.numero = nU;
        this.saldo = s;
        this.nome = nO;
    }

    // GETS
    public String getNomeConta() {
        return nome;
    }

    public int getNumeroConta() {
        return numero;
    }

    public double getSaldoConta() {
        return saldo;
    }

    // SETS
    public void setNomeConta(String nome) {
        this.nome = nome;
    }

    public void setNumeroConta(int numero) {
        this.numero = numero;
    }

    public void setSaldoConta(double saldo) {
        this.saldo = saldo;
    }

    // toString
    public String toString(){
        return ("\nConta \n-----------------------\nNome: " + this.nome + "\nNúmero: " + this.numero + "\nSaldo: " + this.saldo + "\n-----------------------");
    }

}
