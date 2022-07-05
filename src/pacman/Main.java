/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pacman;

/**
 *
 * @author leobusta
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pacman individuo = new Pacman("Verde", 3, 0);
        Tablero board = new Tablero(individuo);
        
        System.out.println("test");
        
        for (int i=0; i < 98; i++) {
            board.getPersonaje().sumarPuntuacion();
        }
        board.comprobarNivelActual();
        
        System.out.println(board.getNivel());
        
    }
    
}
