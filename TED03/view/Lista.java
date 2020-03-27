package view;

import model.Livro;
import model.Usuario;

import javax.swing.*;
import java.util.ArrayList;

public class Lista {

    public static void main(String[] args){

        int quantLivro = 3;
        int quantAluno = Integer.parseInt(JOptionPane.showInputDialog("Deseja cadastrar quantos alunos?"));
        ArrayList<Usuario> aluno = new ArrayList<Usuario>(quantAluno);
        ArrayList<Livro> livros = new ArrayList<Livro>(quantLivro);

        //Usuario[] aluno = new Usuario[quantAluno];

        for(int i = 1; i <= quantAluno; i++){
            String nome = JOptionPane.showInputDialog("Digite o nome do aluno");
            String matricula = JOptionPane.showInputDialog("Digite o matricula do aluno");
            String curso = JOptionPane.showInputDialog("Digite o curso do aluno");
            quantLivro = Integer.parseInt(JOptionPane.showInputDialog("Quatidade de Livros (3 no máximo)"));

            for(int j = 1; j <= quantLivro; j++) {
                String titulo = JOptionPane.showInputDialog("Digite o titulo do livro");
                String isbn = JOptionPane.showInputDialog("Digite o isbn do livro");
                livros.add(new Livro(titulo, isbn));
            }

            aluno.add(new Usuario(nome, matricula, curso, livros));
        }

        JOptionPane.showMessageDialog(null, aluno);

    }
}
