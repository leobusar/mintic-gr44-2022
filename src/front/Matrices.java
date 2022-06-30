package front;
import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author leobusta
 */
public class Matrices {
    
    public static int[][] lee_matriz_enteros(Scanner sc, int n, int m) {

        int[][] x = new int[n][m];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0 ; j <m; j++) {
                System.out.print("Ingrese la componente " + i +","+j+ ": ");
                x[i][j] = sc.nextInt();
            }
        }

        return x;
    }
    
    public static void imprimir_matriz(int[][] x){
//        for(int[] fila:matriz ){
//            for(int elem:fila){
//                System.out.print(elem+"  ");
//            }
//            System.out.println("");
//        }
    
        for (int i = 0; i < x.length; i++) {
            for (int j = 0 ; j < x[0].length; j++) {
                System.out.print( x[i][j] +"  ");
            }
            System.out.println("");
        }
    }
    
    public static int[][] cuadrados_matriz(int[][] x){
        int[][] y = new int[x.length][x[0].length];

        for (int i = 0; i < x.length; i++) {
            for (int j = 0 ; j < x[0].length; j++) {
                y[i][j] = (int) Math.pow(x[i][j], 2);
            }
        }
       
        return y;
    }
    
    public static int[] diagonal( int[][] x ){
        
        int[] y = new int[x.length];
        for (int i = 0; i < x.length; i++) {
            y[i] = x[i][i];
        }
        
        return y;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[][] matriz = lee_matriz_enteros(sc,3,3);
        
        imprimir_matriz(matriz);
        
//        int[][] matriz_result = cuadrados_matriz(matriz);
//        imprimir_matriz(matriz_result);
        
        int[] diag = diagonal(matriz);
        
        System.out.println(Arrays.toString(diag));
    }
    
}