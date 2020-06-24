package com.mycompany.pryfactory;

import Interfaz.ClsIFigura;

public class ClsCirculo implements ClsIFigura {

    private double area;
    private double Peri;

    @Override
    public String Area(double a, double b, double c, double altura) {
        area = 0;
        area = Math.PI * Math.pow(a, 2);
        return "El área del Círculo es: " + area;
    }

    @Override
    public String Perimetro(double a, double b, double c) {
        Peri = 0;
        Peri = 2 * Math.PI * a;
        return "El perímetro del Círculo es: " + Peri;
    }

    @Override
    public String Descripcion() {
        return "La figura es un Circulo";
    }

}
