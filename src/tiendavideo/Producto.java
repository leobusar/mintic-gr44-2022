/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendavideo;

/**
 *
 * @author leobusta
 */
public class Producto {
    private String nombre;
    private double precio;
    private String codigo;

    public Producto(String nombre, double precio, String codigo) {
        this.nombre = nombre;
        this.precio = precio;
        this.codigo = codigo;
    }
    
    @Override
    public String toString(){
        String output;
        output = "Nombre: "+nombre+"\nPrecio: "+precio+"\nCodigo: "+codigo;
        
        return output;
    }
    
     public void imprimir(){
        String output;
        output = "Nombre: "+nombre+"\nPrecio: "+precio+"\nCodigo: "+codigo;
        
         System.out.println(output);
    }   

}
