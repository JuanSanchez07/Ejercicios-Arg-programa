/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tp_clase2;

import java.util.Scanner;

public class Ejercicio4 {
    
    public static void main(String a[]){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese cant de grados celcius a medir: ");
        
        float C = leer.nextFloat();
        float F = 32 + (9 * C / 5);

        System.out.println(C+"º C son equivalentes a "+F+"º.");
    }
}
