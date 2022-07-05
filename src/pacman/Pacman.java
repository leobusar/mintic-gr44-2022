/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pacman;

/**
 *
 * @author leobusta
 */
public class Pacman {
    private String color; 
    private int vidas; 
    private int puntuacion ; 
    
   public Pacman(){
       color = "Amarillo";
       vidas = 3;
       puntuacion = 0;
   }

   public Pacman(String color, int vidas, int puntuacion) {
        this.color = color;
        this.vidas = vidas;
        this.puntuacion = puntuacion;
   }
   
   public int sumarPuntuacion(){
       puntuacion = puntuacion +1;
       return puntuacion;
   }
   
   public int obtenerPuntuacion(){
       return this.puntuacion;
   }
   
   public void restarVida(){
       vidas--; // vidas -=1; vidas = vidas-1;
   }
  
   public boolean sigueVivo(){
       return vidas > 0; 
   }
   
    
}
