package Ejercicios;

import java.util.Scanner;

/*
Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios y le pida al usuario un número a buscar en el vector.
El programa mostrará dónde se encuentra el numero y si se encuentra repetido
*/

public class Ejercicio2 {
    
    public static void main(String a[]){
        int N, num,  cont;
        cont = 0;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el tamaño del vector: ");
        N = leer.nextInt();
        
        int [] vector = new int[N];
        
        for(int i = 0; i < N; i++){
            vector[i] = (int) (Math.random() * 10 + 1);
            System.out.println("vector[i] : "+ vector[i]);
        }
        
        System.out.println("Ingrese n a buscar: ");
        num = leer.nextInt();
        
        for(int i = 0; i < N; i++){
            if(vector[i] == num)
                cont++;
        }
        
        switch (cont){   
            case 0:
                System.out.println("El número elegido no se encuentra dentro del vector.");
                break;
            case 1:
                System.out.println("El número elegido se encuentra 1 vez dentro del vector. ");
                break;
            default:
                System.out.println("El número elegido se encuentra "+ cont + " dentro del vector.");
                break;
        }
       
       
    }  
}
