package main.nombres.malo;

import main.nombres.*;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Punto> c = Arrays.asList(
                new Punto(0, 0),
                new Punto(10, 0),
                new Punto(10, 10),
                new Punto(0, 10)
        );
        
        System.out.println("Antes de rotar:");
        c.forEach(p -> {
            System.out.println(p);
        });
        
        List<Punto> cr = Transf.r(c, 45);
        
        System.out.println("Despues de rotar");
        cr.forEach(p -> {
            System.out.println(p);
        });
    }
}
