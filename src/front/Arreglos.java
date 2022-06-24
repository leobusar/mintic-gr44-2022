package front;
import java.util.Scanner;

public class Arreglos {

    public static int[] lee_arreglo_enteros(Scanner sc, int n){
        
        int[] x = new int[n];
        
        for(int i=0; i < n ; i++) {
            System.out.print("Componente "+ (i+1) +":" );
            x[i] = sc.nextInt();
        }
        return x;
    }
    
    public static void imprime_arreglo(int[] x){
//        int n = x.length; 
//        for(int i=0; i <n ; i++) {
//            System.out.print(x[i]+" ");
//        }

          for (int elem:x){
              System.out.print(elem+ " ");
          }
              
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] arreglo = lee_arreglo_enteros(sc, 4);
        
        imprime_arreglo(arreglo);
    }
    
}
