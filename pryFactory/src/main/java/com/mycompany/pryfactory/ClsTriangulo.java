package com.mycompany.pryfactory;

import Interfaz.ClsIFigura;

public class ClsTriangulo implements ClsIFigura {

    private double bxh;
    private double Peri;

    @Override
    public String Area(double a, double b, double c, double altura) {
        bxh = 0;
        bxh = a * altura / 2;
        return "El área del Triángulo es: " + bxh;
    }

    @Override
    public String Perimetro(double a, double b, double c) {
        Peri = 0;
        Peri = a + b + c;
        return "El perímetro del Triángulo es: " + Peri;
    }

    @Override
    public String Descripcion() {
        return "La figura es un Triángulo";
    }
}
