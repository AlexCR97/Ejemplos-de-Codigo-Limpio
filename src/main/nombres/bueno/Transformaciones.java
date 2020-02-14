package main.nombres.bueno;

import java.util.List;
import java.util.stream.Collectors;
import main.nombres.Punto;

public class Transformaciones {
    
    public static List<Punto> rotar(List<Punto> puntos, double grados) {
        double radianes = Math.toRadians(grados);
        double cos = Math.cos(radianes);
        double sen = Math.sin(radianes);
        
        return puntos.stream()
        .map(punto -> {
            double xNueva = (punto.x * cos) - (punto.y * sen);
            double yNueva = (punto.x * sen) + (punto.y * cos);
            return new Punto(xNueva, yNueva);
        })
        .collect(Collectors.toList());
    }
}
