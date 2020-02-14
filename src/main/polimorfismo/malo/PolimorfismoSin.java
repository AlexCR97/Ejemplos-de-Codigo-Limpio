package main.polimorfismo.malo;

import java.util.Arrays;
import java.util.List;

public class PolimorfismoSin {
    
    static class Cuadrado {
        public final String nombre;
        public final double lado;

        public Cuadrado(String nombre, double lado) {
            this.nombre = nombre;
            this.lado = lado;
        }
    }
    
    static class Circulo {
        public final String nombre;
        public final double radio;

        public Circulo(String nombre, double radio) {
            this.nombre = nombre;
            this.radio = radio;
        }
    }
    
    public static void main(String[] args) {
        List<Object> figuras = Arrays.asList(
                new Cuadrado("Cuadrado", 14.15),
                new Circulo("Triangulo", 6.50)
        );
        
        figuras.forEach(figura -> {
            if (figura instanceof Cuadrado) {
                Cuadrado cuadrado = (Cuadrado) figura;
                System.out.println("Figura: " + cuadrado.nombre);
                System.out.println("Area: " + (cuadrado.lado * cuadrado.lado));
                System.out.println("Perimetro: " + (cuadrado.lado * 4));
            }
            else if (figura instanceof Circulo) {
                Circulo circulo = (Circulo) figura;
                System.out.println("Figura: " + circulo.nombre);
                System.out.println("Area: " + (Math.PI * circulo.radio * circulo.radio));
                System.out.println("Perimetro: " + (Math.PI * circulo.radio * 2));
            }
            System.out.println("");
        });
    }
}
