package main.comentarios.malo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Expresiones {
    
    public static String[] tokens(String expresion) {
    //public static List<String> tokensFrom(String expresion) {
        /*String[] tokens = expresion.split(" ");
        List<String> tokensLista = new ArrayList<>();
        
        tokensLista.addAll(Arrays.asList(tokens));
        
        return tokensLista;*/
        
        String[] tokens = expresion.split(" ");
        return tokens;
    }
}
