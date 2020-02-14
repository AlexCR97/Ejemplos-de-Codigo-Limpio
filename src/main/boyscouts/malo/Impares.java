package main.boyscouts.malo;

public class Impares{
 public static void main(String[] args){
     System.out.println("Numero impares");
 int n, c=0;
 int contador=0;
 for ( n=1;n<=10;n++){
 c= n%2;
 if (c != 0) {
 contador=contador+n;
 System.out.println(n+" ");
 }
 }
     System.out.println("\n");
}
 
}
