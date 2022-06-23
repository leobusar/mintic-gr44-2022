package front;
import java.util.Scanner;

/**
 *
 * @author leobusta
 */
public class Main {
    
     public static double rectangulo(double a, double b){
        return a*b;
    }
    
    public static void main(String a[]){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite altura: ");
        double altura = sc.nextDouble();
        System.out.println("Digite base: ");
        double base = sc.nextDouble();
        System.out.println(rectangulo(base, altura));
    }
}
