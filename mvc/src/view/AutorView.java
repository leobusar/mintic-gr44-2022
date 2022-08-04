/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.util.Scanner;

/**
 *
 * @author leobusta
 */
public class AutorView {
    public int menuAutor(){
        
        Scanner sc = new Scanner(System.in);
        int opc = 0;
        {
            System.out.println("***** Autors *******");
            System.out.println("1. Crear Autor");
            System.out.println("2. Buscar Autor");
            System.out.println("3. Listar Autor");
            System.out.println("4. Actualizar Autor");
            System.out.println("5. Eliminar libro");
            System.out.print("Ingrese una opción: ");
            opc = sc.nextInt();
        }while(opc< 1 && opc > 5 );
        
        return opc;
    }    
}
