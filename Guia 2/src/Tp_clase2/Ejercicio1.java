package Tp_clase2;

import java.util.Scanner;

public class Ejercicio1 {
    
    public static void main(String[] args) {
        
        Scanner numero = new Scanner(System.in);
        
        System.out.println("Ingrese primer número: ");
        int suma = numero.nextInt();
               
        System.out.println("Ingrese segundo número: ");
        suma = suma + numero.nextInt();
          
        System.out.println("La suma total es: "+suma);
    }
    
}
