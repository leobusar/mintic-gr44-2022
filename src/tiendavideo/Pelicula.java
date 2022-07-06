/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendavideo;

/**
 *
 * @author leobusta
 */
public class Pelicula extends Producto{
    private double duracion;

    public Pelicula(double duracion, String nombre, double precio, String codigo) {
        super(nombre, precio, codigo);
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        String output = super.toString();
        
        return  output+"\nduracion=" + duracion;
    }
    
    
    
}
