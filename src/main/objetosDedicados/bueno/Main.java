package main.objetosDedicados.bueno;

public class Main {
    
    public static void main(String[] args) {
        Cajero cajero = new Cajero();
        
        System.out.println("Tu saldo inicial es " + cajero.saldo());
        
        cajero.depositar(100);
        cajero.retirar(3400);
        
        System.out.println("Tu saldo actual es " + cajero.saldo());
    }
}
