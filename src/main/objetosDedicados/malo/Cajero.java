package main.objetosDedicados.malo;

public class Cajero {
    
    private double dinero = 5000;
    
    public void depositar(double deposito) {
        dinero += deposito;
        
        System.out.println("Se depositaron " + deposito);
    }
    
    public double retirar(double retiro) {
        dinero -= retiro;
        
        System.out.println("Se retiraron " + retiro);
        
        return retiro;
    }

    public double saldo() {
        return dinero;
    }
    
}
