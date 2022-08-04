/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.util.List;
import java.util.Scanner;
import model.Libro;

/**
 *
 * @author leobusta
 */
public class LibroView {
    
    public void mostrarLibros(List<Libro> libros){
        for(Libro l: libros){
            System.out.println("***** Datos Libro "+ l.getLibId()+ "******");
            System.out.println("Nombre: "+l.getLibNombre());
            System.out.println("Precio: "+l.getPrecio());
        }
    }
    
    public int menuLibros(){
        
        Scanner sc = new Scanner(System.in);
        int opc;
        do {
            System.out.println("***** Libros *******");
            System.out.println("1. Crear Libro");
            System.out.println("2. Buscar Libro");
            System.out.println("3. Listar Libro");
            System.out.println("4. Actualizar Libro");
            System.out.println("5. Eliminar libro");
            System.out.print("Ingrese una opción: ");
            opc = sc.nextInt();
        }while(opc< 1 && opc > 5 );
        
        return opc;
    }
    
    public Libro libroForm(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese los datos del libro");
        System.out.print("Id: ");
        int id = sc.nextInt(); sc.nextLine();
        System.out.print("Nombre: ");
        String nombre =  sc.nextLine();
        System.out.print("Año publicación: ");
        int pub = sc.nextInt(); sc.nextLine();
        System.out.print("Precio: ");
        double precio = sc.nextDouble(); sc.nextLine();        
        
        Libro libro = new Libro(id,nombre, pub, 1,1, precio); 
        
        return libro;
    
    }
    
}
