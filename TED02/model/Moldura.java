package model;

public class Moldura {

    //ATRIBUTOS
    public float altura;
    public float largura;
    public float expessura;

    //CONSTRUTOR
    public Moldura(float a, float l, float e){

        this.altura = a;
        this.largura = l;
        this.expessura = e;
    }

    //OUTROS METODODS
    public float calcAreaExterna(){

        return this.altura*this.largura;
    }

    public float calcAreaInterna(){

        return (this.altura - (this.expessura+this.expessura)) * (this.largura - (this.expessura+this.expessura));
    }

    public float calcAreaMoldura(){

        return calcAreaExterna()-calcAreaInterna();
    }

}
