package main.polimorfismo.bueno;

import java.util.Arrays;
import java.util.List;

public class PolimorfismoCon {
    
    static abstract class Figura {
        public abstract double calcularArea();
        public abstract double calcularPerimetro();
        public abstract String getNombre();
    }
    
    static class Cuadrado extends Figura {
        private final double lado;

        public Cuadrado(double lado) {
            this.lado = lado;
        }
        
        @Override
        public double calcularArea() {
            return lado * lado;
        }

        @Override
        public double calcularPerimetro() {
            return lado * 4;
        }

        @Override
        public String getNombre() {
            return "Cuadrado";
        }
    }
    
    static class Circulo extends Figura {
        private final double radio;

        public Circulo(double radio) {
            this.radio = radio;
        }
        
        @Override
        public double calcularArea() {
            return Math.PI * radio * radio;
        }

        @Override
        public double calcularPerimetro() {
            return Math.PI * radio * 2;
        }

        @Override
        public String getNombre() {
            return "Cuadrado";
        }
    }
    
    public static void main(String[] args) {
        List<Figura> figuras = Arrays.asList(
                new Cuadrado(14.15),
                new Circulo(6.50)
        );
        
        figuras.forEach(figura -> {
            System.out.println("Figura: " + figura.getNombre());
            System.out.println("Area: " + figura.calcularArea());
            System.out.println("Perimetro: " + figura.calcularPerimetro());
            System.out.println("");
        });
    }
}
