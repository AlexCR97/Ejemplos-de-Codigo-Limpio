package main.kiss.bueno;

import java.util.List;

public class Kiss {
    
    public String encontrarNombreConInicial(List<String> nombres, char primeraLetra) {
        return nombres.stream()
        .map(nombre -> {
            return nombre.trim().toLowerCase();
        })
        .filter(nombre -> {
            return nombre.charAt(0) == Character.toLowerCase(primeraLetra);
        })
        .map(nombre -> {
            char primeraLetraMin = nombre.charAt(0);
            char primeraLetraMay = Character.toUpperCase(primeraLetraMin);
            String sinPrimeraLetra = nombre.substring(1);

            return primeraLetraMay + sinPrimeraLetra;
        })
        .findFirst().get();
    }
    
}













