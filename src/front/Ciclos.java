/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package front;

import java.util.Scanner;

/**
 *
 * @author leobusta
 */
public class Ciclos {
    
    public static void misterio(){
        int i = 2;
        int j = 25;
        while (i < j){
            System.out.println(i+" "+j);
            i = i * 2;
            j = j + 10;
        }
        System.out.println(" the end ");
        System.out.println(i+" "+j);
    }
    
    public static void login(){
        
        Scanner sc = new Scanner(System.in);
        
        int intentos = 0; 
        
        do {
            System.out.println("Ingrese la contraseña:");
            int pass = sc.nextInt();
            if (pass == 1234){
                System.out.println("Autorizado");
                continue;
            }
            intentos++;
        
        } while (intentos < 3);
    
    }
    
    public static double minMaquina() {
        double Xo = 1; 
        double Xi = 1/(double)2;
        do {
            Xo = Xi;
            Xi = Xo/2;
        } while(Xi > 0);
        
        return Xo;
    }
    
    public static int suma(int n){
        int s = 0; 
        
        for(int i = 0; i <= n ;i++){
            s += i; // s  = s + i
        }
        
        return s;
    }
    
    public static void imprimir(int n){
    
        for(int i=n; i> 0; i--){
            System.out.print(i+" ");
        }
    }
    
    public static void colecciones(){
        String[] frutas = new String[]{"Tomate de arbol", "Maracuyá", "Guayaba", "Lulo", "Guanabana"};
        
        for (String elem:frutas ){
            if(elem.equals("Lulo")){
                break;
            }
            System.out.println(elem);
        }
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //System.out.println("Digite la letra: ");
        //char letra = sc.nextLine().charAt(0);
        //int i = 0;
        //while (i <= 6) {
        //    System.out.println(i);
        //    i++;
        //}
        
        //System.out.println(minMaquina());
        
        //login();
        //System.out.println("Ingrese el número de dígitos");
        //int num = sc.nextInt();
        //System.out.println(suma(num));
        //imprimir(num);
        colecciones();
    }
}
