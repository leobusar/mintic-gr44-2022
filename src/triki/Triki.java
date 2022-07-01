/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package triki;
import java.util.Scanner;

/**
 *
 * @author leobusta
 */
public class Triki {

    public char[][] a;
    
    public Triki(){
        
        this.a = new char[3][3];
        
        for(int i = 0;i < 3; i++){
            for(int j = 0;j < 3; j++){
                a[i][j] = 'a';
            }
        }
    }
    
    public void imprimirTablero(){
         for(int i = 0;i < 3; i++){
            for(int j = 0;j < 3; j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println("");
        }   
    }
    
    public boolean marcarCasilla(char simbolo, int fila, int columna){
        if(fila >=3 || columna >=3 || this.a[fila][columna] != 'a'){
            return false;
        }
        
        this.a[fila][columna] = simbolo;
        return true;
    }
    
    public char verificarGanador(){
        
        for(int i = 0;i < 3; i++){
            if(a[i][0]==a[i][1] && a[i][1]==a[i][2] && a[i][1]!='a'){
                return a[i][0];
            }
        }

        for(int i = 0;i < 3; i++){
            if(a[0][i]==a[1][i] && a[1][i]==a[2][i] && a[1][i]!='a'){
                return a[i][0];
            }
        }
        
        if (a[1][1]==a[2][2] && a[0][0] == a[1][1] && a[0][0] != 'a')
            return a[0][0];
        
        if (a[1][1]==a[0][2] && a[2][0] == a[1][1] && a[2][0] != 'a')
            return a[0][0];        
        
        return 'a';
    }
    
    public void setA( char[][] a){
        this.a = a;
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Triki triki = new Triki();
        Scanner sc = new Scanner(System.in);
        
        triki.imprimirTablero();
        
//        System.out.println("Digite la posición para la X:");
//        System.out.println("Fila:");
//        int fila = sc.nextInt();
//        System.out.println("Columna:");
//        int columna = sc.nextInt();
//        triki.marcarCasilla('X', fila, columna);

        while (triki.verificarGanador() == 'a'){
            System.out.println("Digite la jugada (Ej: X 0 1):");
            String jugada=sc.nextLine();
            String[] jugadaA = jugada.split(" ");
            char simbolo = jugadaA[0].charAt(0);
            int fila = Integer.parseInt(jugadaA[1]);
            int columna = Integer.parseInt(jugadaA[2]);
            
            triki.marcarCasilla(simbolo, fila, columna);
            triki.imprimirTablero();
            System.out.println("-----------------");
        }
        
        
//        
//        char[][] matriz = {{'O','X','X'},{'a','a','X'},{'O','X','O'}};
//        triki.setA(matriz);
//        triki.imprimirTablero();
//
        System.out.println("El ganador es: "+triki.verificarGanador());
        triki.imprimirTablero();

    }
    
}
