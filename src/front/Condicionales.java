package front;
import java.util.Scanner;

/**
 *
 * @author leobusta
 */
public class Condicionales {
    
    public static double valorAbsoluto(double x) {
        
        double ret; 
        if (x >= 0){
            ret = x;
        } else {
            ret = -x;
        }
        
        return ret;        
    }
    
    public static double valorAbsoluto2(double x) { 
              
        /*if (x >= 0){
            return x;
        } else {
            return -x;
        }*/
        
        return (x >= 0)? x : -x;
    }
    
    public static double maximo(double x, double y) {
        
        double ret =  (x > y)? x : y; 
    
        return ret;
    }
    
    public static double pagoFinal(int n, double precio){
        
        double valor; 
        
        if (n <= 5 ){
            valor = n * precio;
        }else if (n  <= 10 ){
            valor = n * precio*0.95;
        }else if (n  <= 20 ){
            valor = n * precio*0.90;
        }else {
            valor = n * precio*0.8;
        }
        return valor; 
    }
    
    public static boolean esVocal(char ch){
        
        boolean result;
        
        switch(ch){
            case 'a':
            case 'e': 
            case 'i': 
            case 'o': 
            case 'u': 
                result = true;
            break;
            default: 
                result = false;
            break;                     
        }
        
        return result;        
    }
    
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite la letra: ");
        char letra = sc.nextLine().charAt(0);
        
        System.out.println(esVocal(letra));
    }
}