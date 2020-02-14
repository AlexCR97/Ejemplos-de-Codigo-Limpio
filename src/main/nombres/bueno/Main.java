package main.nombres.bueno;

import java.util.Arrays;
import java.util.List;
import main.nombres.Punto;

public class Main {
    public static void main(String[] args) {
        List<Punto> cuadrado = Arrays.asList(
                new Punto(0, 0),
                new Punto(10, 0),
                new Punto(10, 10),
                new Punto(0, 10)
        );
        
        System.out.println("Antes de rotar:");
        cuadrado.forEach(punto -> {
            System.out.println(punto);
        });
        
        List<Punto> cuadradoRotado = Transformaciones.rotar(cuadrado, 45);
        
        System.out.println("Despues de rotar");
        cuadradoRotado.forEach(punto -> {
            System.out.println(punto);
        });
    }
}
