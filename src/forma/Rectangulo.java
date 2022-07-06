/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package forma;

/**
 *
 * @author leobusta
 */
public class Rectangulo extends Forma {
    private double ladoMayor;
    private double ladoMenor; 

    public Rectangulo(double ladoMayor, double ladoMenor, String color, double centroX, double centroY, String nombre) {
        super(color, centroX, centroY, nombre);
        this.ladoMayor = ladoMayor;
        this.ladoMenor = ladoMenor;
    }

    public double getLadoMenor() {
        return ladoMenor;
    }

    public void setLadoMenor(double ladoMenor) {
        this.ladoMenor = ladoMenor;
    }

    public double getLadoMayor() {
        return ladoMayor;
    }

    public void setLadoMayor(double ladoMayor) {
        this.ladoMayor = ladoMayor;
    }
    
//    @Override
//    public void imprimir(){
//        super.imprimir();
//        System.out.println("Lados: ("+ladoMayor+", "+ladoMenor+")");
//        
//    }
    
    public double calcularArea(){
        return ladoMayor * ladoMenor;
    }
}
