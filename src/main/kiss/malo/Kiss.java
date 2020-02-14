package main.kiss.malo;

public class Kiss {
    
    public String encontrarNombreConInicial(String[] nombres, char primeraLetra) {
        for (int i = 0; i < nombres.length; i++) {
            nombres[i] = nombres[i].trim().toLowerCase();
        }
        
        String[] nombresFiltrados = new String[nombres.length];
        int contador = 0;
        
        for (int i = 0; i < nombres.length; i++) {
            if (nombres[i].charAt(0) == Character.toLowerCase(primeraLetra)) {
                nombresFiltrados[contador] = nombres[i];
                contador++;
            }
        }
        
        for (int i = 0; i < nombresFiltrados.length; i++) {
            if (nombresFiltrados[i] != null) {
                char primeraLetraMin = nombresFiltrados[i].charAt(0);
                char primeraLetraMay = Character.toUpperCase(primeraLetraMin);
                String sinPrimeraLetra = nombresFiltrados[i].substring(1);

                nombresFiltrados[i] = primeraLetraMay + sinPrimeraLetra;
            }
        }
        
        return nombresFiltrados[0];
    }
    
}
