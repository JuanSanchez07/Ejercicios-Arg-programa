//Simular la división usando solamente restas. Dados dos números enteros mayores que uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo restas. 
//Método: Restar el dividendo del divisor hasta obtener un resultado menor que el divisor, este resultado es el residuo, y el número de restas realizadas es el cociente.
//Por ejemplo: 50 / 13:
//50 – 13 = 37     una resta realizada
//37 – 13 = 24     dos restas realizadas
//24 – 13 = 11     tres restas realizadas
//dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
//¿Aún no lo entendiste? Recomendamos googlear división con restas sucesivas.

package extras_guia3;

import java.util.Scanner;

public class Extras_Guia3 {

    public static void main(String[] args) {
        int cociente;
        Scanner leer = new Scanner(System.in);
        
        cociente = 0; 
        
        System.out.println("Ingrese dividendo: ");
        int dividendo = leer.nextInt();
        
        System.out.println("Ingrese divisor: ");
        int divisor = leer.nextInt();
  
        do{
            System.out.print(dividendo + " - " + divisor + " = ");
            dividendo = dividendo - divisor;
            cociente = cociente + 1;
            if(cociente == 1)
                System.out.println(dividendo + "    " + cociente + " resta realizada.");
            else
                System.out.println(dividendo + "    " + cociente + " restas realizadas.");          
        }while(dividendo >= divisor);
        
        System.out.println("dado que " + dividendo + " es menor que " + divisor  + ", entonces: el residuo es " + dividendo + " y el cociente es " + cociente);
    
    }
    
}
