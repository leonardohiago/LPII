package model;

import java.util.ArrayList;

public class Usuario {

    private String nome;
    private String matricula;
    private String curso;
    private ArrayList<Livro> listaL = new ArrayList<Livro>(3);
    //private Livro[] listaL = new Livro[3];

    public Usuario(String n, String m, String c, ArrayList<Livro> listaL){

        this.nome = n;
        this.matricula = m;
        this.curso = c;
        this.listaL = listaL;

    }

    public void setListaL(ArrayList<Livro> novaLista) {

        this.listaL = novaLista;
    }

    public ArrayList<Livro> getlistaL() {

        return this.listaL;
    }

    public String getNome(String nome) {

        return this.nome;
    }

    public void setNome() {

        this.nome = nome;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula() {

        this.matricula = matricula;
    }

    public String getCurso() {
        return this.curso;
    }

    public void setCurso() {

        this.curso = curso;
    }

    public String toString(){
        return "\nAluno com pendência\nNome: " + this.nome + "\nMatrícula: "
                + this.matricula + "\nCurso: " + this.curso + "\nLivros: " + this.listaL + "\n\n\n";
    }
}
