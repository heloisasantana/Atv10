package com.example.atv10;

public class GeometriaController implements IGeometriaController {

    @Override
    public float calcularArea(Object figura) {
        if (figura instanceof Retangulo) {
            Retangulo retangulo = (Retangulo) figura;
            return retangulo.getBase() * retangulo.getAltura();
        } else if (figura instanceof Circulo) {
            Circulo circulo = (Circulo) figura;
            return (float) (Math.PI * Math.pow(circulo.getRaio(), 2));
        }
        return 0;
    }

    @Override
    public float calcularPerimetro(Object figura) {
        if (figura instanceof Retangulo) {
            Retangulo retangulo = (Retangulo) figura;
            return 2 * (retangulo.getBase() + retangulo.getAltura());
        } else if (figura instanceof Circulo) {
            Circulo circulo = (Circulo) figura;
            return (float) (2 * Math.PI * circulo.getRaio());
        }
        return 0;
    }
}
