package Tp_clase2;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String a[]){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese frase: ");
        String frase = leer.nextLine();
        
        System.out.println("Frase en mayusculas: "+ frase.toUpperCase());
        
        System.out.println("Frase en minusculas: "+ frase.toLowerCase());
        
    }
}
