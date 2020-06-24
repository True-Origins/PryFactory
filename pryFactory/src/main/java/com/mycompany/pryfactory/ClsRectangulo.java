package com.mycompany.pryfactory;

import Interfaz.ClsIFigura;

public class ClsRectangulo implements ClsIFigura {

    private double bxh;
    private double Peri;

    @Override
    public String Area(double a, double b, double c, double altura) {
        bxh = 0;
        bxh = a * b;
        return "El área del Rectángulo es: " + bxh;
    }

    @Override
    public String Perimetro(double a, double b, double c) {
        Peri = 0;
        Peri = (a + b) * 2;
        return "El perímetro del Rectángulo es: " + Peri;
    }

    @Override
    public String Descripcion() {
        return "La figura es un rectangulo ";
    }
}
