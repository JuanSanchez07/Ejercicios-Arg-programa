package Tp_clase2;

import java.util.Scanner;

public class Ejercicio5 {
    
        public static void main(String a[]){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese n: ");
        
        int n = leer.nextInt();
       
        System.out.println("El doble de n es: "+n*2);
        System.out.println("El triple de n es: "+n*3);
        System.out.println("La raíz cuadrada de n es: "+n*n);
    }
}
