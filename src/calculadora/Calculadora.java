/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;

/**
 *
 * @author leobusta
 */
public class Calculadora {

    public double suma(double num1, double num2) {
        return num1 + num2;
    }

    public double resta(double num1, double num2) {
        return num1 - num2;
    }

    public double multiplicacion(double num1, double num2) {
        return num1 * num2;
    }

    public double division(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            return Double.NaN;
        }
    }
    //import org.junit.jupiter.api.Test;


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

}
