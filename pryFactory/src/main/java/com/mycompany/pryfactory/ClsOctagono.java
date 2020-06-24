package com.mycompany.pryfactory;

import Interfaz.ClsIFigura;

public class ClsOctagono implements ClsIFigura {

    private double Area;
    private double Peri;

    @Override
    public String Area(double a, double b, double c, double altura) {
        Area = 0;
        Peri = a * 8;
        Area = Peri * b / 2;
        return "El área del Octágono es: " + Area;
    }

    @Override
    public String Perimetro(double a, double b, double c) {
        Peri = a * 8;
        return "El perímetro del Octágono es: " + Peri;
    }

    @Override
    public String Descripcion() {
        return "La figura tiene 8 lados Regulares";
    }

}
