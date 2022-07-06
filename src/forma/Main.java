/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package forma;

/**
 *
 * @author leobusta
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Rectangulo forma = new Rectangulo(5,4,"Amarillo", 0, 0, "Rectangulo");
        forma.imprimir();
        forma.setCentro(4.3, 2.1);
        forma.imprimir();
        
    }
    
}
