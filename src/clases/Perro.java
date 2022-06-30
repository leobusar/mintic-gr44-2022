/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author leobusta
 */
public class Perro {

    // Atributos
    public int edad;
    public String nombre;
    public String colorOjos;
    
    // Constructor
    public Perro(int edad, String nombre, String colorOjos) {
        this.edad = edad;
        this.nombre = nombre;
        this.colorOjos = colorOjos;
    }

    //Métodos
    public void ladrar() {
        System.out.println("Guau Guau");
    }

    public void saludar(Persona persona) {
        System.out.println("Hola "+persona.nombre+", mi nombre es " + nombre);
    }
    
    public void quienEsMayor(Perro otro){
        if (otro.edad == this.edad){
            System.out.println("Tenemos la misma edad");
        }else if (otro.edad > this.edad){
             System.out.println(otro.nombre+" es mayor que yo");
        } else {
            System.out.println("Yo soy mayor que "+ otro.nombre);
        }
    }
    
    @Override
    public String toString(){
        return "nombre: "+ nombre + "\nedad: "+edad+"años\ncolor de ojos:"+colorOjos;
    }
    
}
