package main.objetosDedicados.bueno;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

public class Cajero {
    
    private BigDecimal dinero = new BigDecimal("5000");
    
    public void depositar(double deposito) {
        BigDecimal dineroDepositado = new BigDecimal(deposito);
        dinero = dinero.add(dineroDepositado);
        
        System.out.println("Se depositaron " + saldo(dineroDepositado));
    }
    
    public BigDecimal retirar(double retiro) {
        BigDecimal dineroRetirado = new BigDecimal(retiro);
        dinero = dinero.subtract(dineroRetirado);
        
        System.out.println("Se retiraron " + saldo(dineroRetirado));
        
        return dineroRetirado;
    }
    
    public String saldo() {
        return NumberFormat.getCurrencyInstance(Locale.US).format(dinero);
    }
    
    private String saldo(BigDecimal dinero) {
        return NumberFormat.getCurrencyInstance(Locale.US).format(dinero);
    }
}
