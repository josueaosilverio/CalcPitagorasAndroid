package com.example.josue.exercicio3;

public class ponto2D {
    double x;
    double y;

    public ponto2D(double a, double b){
        this.x = a;
        this.y = b;
    }

    public double distanciaCentro(){
        double hipotenusa = Math.sqrt(Math.pow(x, 2) + (Math.pow(y, 2)));
        return hipotenusa;
    }
    public double distanciaPontos(ponto2D p2){
        double x3 = this.x - p2.x;
        double y3 = this.y - p2.y;

        double hipotenusa = Math.sqrt(Math.pow(x3, 2) + (Math.pow(y3, 2)));
        return hipotenusa;
    }
}