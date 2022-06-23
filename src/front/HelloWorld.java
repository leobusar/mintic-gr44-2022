
package front;

import java.util.Scanner;

public class HelloWorld {
   
    public static double cuadrado(double x){
        return x*x;
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
      
        System.out.print("Ingrese el número: ");
        double numero = sc.nextDouble();
        double  res = cuadrado(numero);
        System.out.println("El cuadrado de " + numero + " es: " + res);
        
    }
    
}
