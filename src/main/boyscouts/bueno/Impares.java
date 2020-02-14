package main.boyscouts.bueno;

public class Impares {
    
    public static void main(String[] args) {
        System.out.println("Numero impares");
        
        int contador = 0;
        
        for (int numero = 1; numero <= 10; numero++) {
            int residuo = numero % 2;
            
            if (residuo != 0) {
                contador += numero;
                System.out.println(numero + " ");
            }
        }
    }
}
