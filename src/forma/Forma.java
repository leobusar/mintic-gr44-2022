/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package forma;

/**
 *
 * @author leobusta
 */
public class Forma {
    private String color;
    private Punto centro; 
    private String nombre;

    public Forma(String color, double centroX, double centroY, String nombre) {
        this.color = color;
        this.centro = new Punto(centroX,centroY);
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Punto getCentro() {
        return centro;
    }

    public void setCentro(double coordX, double coordY) {
        
        this.centro.setCoord_x(coordX);
        this.centro.setCoord_y(coordY);
    }
    
    
    public void imprimir(){
        System.out.println("Nombre:"+nombre);
        System.out.println("Centro: ("+centro.getCoord_x()+", "+centro.getCoord_y()+")");
        System.out.println("Color:"+ color);
        
    }
    
}
