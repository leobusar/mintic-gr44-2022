/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author leobusta
 */
public class Persona {
    public String nombre;
    public int edad;
    public char genero;
    public double peso; 
    public double estatura;

    public Persona(String nombre, int edad, char genero, double peso, double estatura) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.peso = peso;
        this.estatura = estatura;
    }
    
    public double calcularIMC(){
    
        return peso/(estatura*estatura);
    }
    
}
