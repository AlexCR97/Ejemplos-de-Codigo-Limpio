package main.argumentosBandera.malo;

public class Codificador {
    
    public static String codificar(String cadena, boolean invertir, boolean intercalar, boolean moverParesAlFinal) {
        String cadenaCodificada = cadena;
        
        if (invertir == false) {
            return cadenaCodificada;
        }
        
        cadenaCodificada = new StringBuilder(cadenaCodificada).reverse().toString();
        
        if (intercalar == false) {
            return cadenaCodificada;
        }
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < cadenaCodificada.length(); i += 2) {
            if (i + 1 >= cadenaCodificada.length()) {
                sb.append(cadenaCodificada.charAt(i));
                break;
            }
            
            char c1 = cadenaCodificada.charAt(i);
            char c2 = cadenaCodificada.charAt(i + 1);
            sb.append(c2).append(c1);
        }
        
        cadenaCodificada = sb.toString();
        
        if (moverParesAlFinal == false) {
            return cadenaCodificada;
        }
        
        sb = new StringBuilder();
        StringBuilder sbFinal = new StringBuilder();
        
        for (int i = 0; i < cadenaCodificada.length(); i++) {
            if (i % 2 == 0) {
                sbFinal.append(cadenaCodificada.charAt(i));
            } else {
                sb.append(cadenaCodificada.charAt(i));
            }
        }
        cadenaCodificada = sb.append(sbFinal).toString();
        
        return cadenaCodificada;
    }
    
    public static void main(String[] args) {
        String s1 = "abcdefg";
        System.out.println(codificar(s1, true, true, true));
    }
}
