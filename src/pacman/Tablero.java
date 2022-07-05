/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pacman;

/**
 *
 * @author leobusta
 */
public class Tablero {
    private Pacman personaje; 
    private int nivel;
    
    public Tablero(Pacman personaje){
        this.personaje = personaje;
        this.nivel = 0;
    }
    
    public void comprobarNivelActual(){
        this.nivel = this.personaje.obtenerPuntuacion()/25;
    }

    public Pacman getPersonaje() {
        return personaje;
    }

    public void setPersonaje(Pacman personaje) {
        this.personaje = personaje;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    
    
    
    
}
