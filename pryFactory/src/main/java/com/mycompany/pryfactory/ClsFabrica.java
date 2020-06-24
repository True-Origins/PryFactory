package com.mycompany.pryfactory;

import Interfaz.ClsIFigura;

public class ClsFabrica {

    public static ClsIFigura fabricar(String fig) {
        switch (fig) {
            case "Cuadrado":
                return new ClsCuadrado();
            case "Rectángulo":
                return new ClsRectangulo();
            case "Triángulo":
                return new ClsTriangulo();
            case "Círculo":
                return new ClsCirculo();
            case "Octágono":
                return new ClsOctagono();
            default:
                return null;
        }
    }
}
