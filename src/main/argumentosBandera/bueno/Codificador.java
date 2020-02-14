package main.argumentosBandera.bueno;

public class Codificador {
    
    // abcdefg
    // gfedcba
    public static String invertir(String cadena) {
        return new StringBuilder(cadena).reverse().toString();
    }
    
    // gfedcba
    // fgdebca
    public static String intercalar(String cadena) {
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < cadena.length(); i += 2) {
            if (i + 1 >= cadena.length()) {
                sb.append(cadena.charAt(i));
                break;
            }
            
            char c1 = cadena.charAt(i);
            char c2 = cadena.charAt(i + 1);
            sb.append(c2).append(c1);
        }
        return sb.toString();
    }
    
    // fgdebca
    // gecfdba
    public static String moverParesAlFinal(String cadena) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sbFinal = new StringBuilder();
        
        for (int i = 0; i < cadena.length(); i++) {
            if (i % 2 == 0) {
                sbFinal.append(cadena.charAt(i));
            } else {
                sb.append(cadena.charAt(i));
            }
        }
        return sb.append(sbFinal).toString();
    }
    
    public static void main(String[] args) {
        String s1 = "abcdefg";
        String s2 = invertir(s1);
        String s3 = intercalar(s2);
        String s4 = moverParesAlFinal(s3);
        System.out.println(s4);
    }
}
