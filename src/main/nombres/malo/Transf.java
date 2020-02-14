package main.nombres.malo;

import main.nombres.*;
import java.util.List;
import java.util.stream.Collectors;

public class Transf {
    
    public static List<Punto> r(List<Punto> p, double g) {
        return p.stream()
        .map(punto -> {
            return new Punto(
                (punto.x * Math.cos(Math.toRadians(g))) - (punto.y * Math.sin(Math.toRadians(g))),
                (punto.x * Math.sin(Math.toRadians(g))) + (punto.y * Math.cos(Math.toRadians(g)))
            );
        })
        .collect(Collectors.toList());
    }
}
