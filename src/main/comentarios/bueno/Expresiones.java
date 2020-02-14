package main.comentarios.bueno;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Expresiones {
    
    public static List<String> tokens(String expresion) {
        String[] tokens = expresion.split(" ");
        List<String> tokensLista = new ArrayList<>();
        
        tokensLista.addAll(Arrays.asList(tokens));
        
        return tokensLista;
    }
}
