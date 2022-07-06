/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendavideo;

import java.util.Scanner;

/**
 *
 * @author leobusta
 */
public class TiendaVideo {
    private String nombre;
    private Producto[] productos;
    private int ultimo;
    
    TiendaVideo(String nombre){
        productos = new Producto[100];
        this.nombre = nombre;
        ultimo = 0;
    }
    
    public void agregarProducto(Producto producto){
        productos[ultimo] = producto;
        ultimo++;
    }
    
    public void listarProductos(){
    
        for(int i =0; i < ultimo; i++){
            System.out.println(productos[i]);
            //productos[i].imprimir();
            System.out.println("-----------");
        }
    }    
        
    public int procesarComandos(String comando){
    
        String[] comandoArr = comando.split("&");  

        /*
            1&nombre&precio&codigo  // 1&Libro&nombre&precio&codigo&nro_paginas
                                    // 1&Pelicula&nombre&precio&codigo&duracion
            2 Listar
            3 Salir
        */
        
        int opcion = Integer.parseInt(comandoArr[0]);
        
        switch(opcion){
            case 1:
                String tipo = comandoArr[1];
                String nombre = comandoArr[2];
                double precio = Double.parseDouble(comandoArr[3]);
                String codigo = comandoArr[4];
                /*Producto product = new Producto(nombre,precio,codigo);
                agregarProducto(product);*/
                if( tipo.equals("Libro")){
                    int n = Integer.parseInt(comandoArr[5]);
                    Libro libro = new Libro(n,nombre,precio,codigo);
                    agregarProducto(libro);
                } else {
                    double duracion = Double.parseDouble(comandoArr[5]);
                    Pelicula peli = new Pelicula(duracion,nombre,precio,codigo);
                    agregarProducto(peli);
                }                
                break;
                
            case 2:
                listarProductos();
                break;
                
            case 3:
//                System.exit(0);
                break;
        }
        
        return opcion;
    }
    
    public static void main(String[] args){
        int opcion;
        TiendaVideo tienda = new TiendaVideo("blockbustaer");
        Scanner sc = new Scanner(System.in);
    
        do{
            String linea = sc.nextLine();
            opcion = tienda.procesarComandos(linea);
        }while(opcion != 3);
    
    }
    
}
