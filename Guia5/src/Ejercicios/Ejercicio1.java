package Ejercicios;

// Realizar un algoritmo que llene un vector con los 100 primeros números enteros
// y los muestre por pantalla en orden descendente.

public class Ejercicio1 {

    public static void main(String[] args) {
        int n = 0;
        int [] vector = new int[100];
        
        for(int i = 0; i < 100; i++){
            vector[i] = n;
            n++;
            System.out.println("vector[i] : "+ vector[i]);
        }
        
        
    }
    
}
