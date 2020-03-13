package model;

public class Circulo {
    //ATRIBUTOS
    public float raio;

    //CONSTRUTOR
    public Circulo(float r){

        this.raio = r;
    }

    //OUTROS METODOS
    public float calcArea(){

        return (this.raio*this.raio)*3.14f;
    }
}
