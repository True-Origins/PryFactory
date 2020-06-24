package com.mycompany.pryfactory;

import Interfaz.ClsIFigura;

public class ClsCuadrado implements ClsIFigura {

    private double Area;
    private double Peri;

    @Override
    public String Area(double a, double b, double c, double altura) {
        Area = 0;
        Area = a * b;
        return "El área del Cuadrado es: " + Area;
    }

    @Override
    public String Perimetro(double a, double b, double c) {
        Peri = 0;
        Peri = a * 4;
        return "El perímetro del Cuadrado es: " + Peri;
    }

    @Override
    public String Descripcion() {
        return "La figura es un Cuadrado";
    }

}
