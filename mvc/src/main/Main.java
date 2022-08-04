/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import controller.AutorController;
import controller.LibroController;
import java.util.Scanner;

/**
 *
 * @author leobusta
 */
public class Main {
    
    public static int menuPrincipal(){
        Scanner sc = new Scanner(System.in);
        
        int opc = 0;
        {        
            System.out.println("1. Administrar libros.");
            System.out.println("2. Administrar autores.");
            System.out.println("3. Administrar editorial.");
            opc = sc.nextInt();
        }while(opc< 1 && opc > 5 );
        
        return opc;        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int opc = menuPrincipal();
        switch(opc){
            case 1:         
                LibroController libroControlador = new LibroController();
                libroControlador.administrarLibro();
                break;
            case 2: 
                AutorController autorControlador = new AutorController();
                autorControlador.administrarAutor();
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("No implementada");
                break;            
         }
    }
    
}
