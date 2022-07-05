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
        
//        Scanner sc = new Scanner(System.in);
//        
//        System.out.println("Digite altura: ");
//        double altura = sc.nextDouble();
//        System.out.println("Digite base: ");
//        double base = sc.nextDouble();
//        System.out.println(rectangulo(base, altura));

          String yincana="G,Y,Y,Y,G,G,Z,Z,K,K";
          
          char i_seguidor = yincana.charAt(0);
          String[] ganadores = yincana.split(",");
          
          System.out.println(i_seguidor);
          
          System.out.println(ganadores[0]);

    }
}
