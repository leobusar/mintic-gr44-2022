/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package front;
import java.util.Scanner;

/**
 *
 * @author leobusta
 */
public class Cadena {

    public static boolean compareCadenas( String b ){        
       
        return "hola".equalsIgnoreCase(b); //a.equals(b);
    }
    
    public static void extraerDatos(String cadena){
    
       String[] line = cadena.split(","); 
       // "Juan,30,1.68";
       String nombre = line[0];
       int edad = Integer.parseInt(line[1].trim());
       double estatura = Double.parseDouble(line[2].trim());
       
        System.out.println("nombre: "+ nombre);
        System.out.println("edad: "+ edad);
        System.out.println("estatura: "+ estatura+"m");
       
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*System.out.println("Digite\nla\nletra: ");
        
        String miCadena = "¡Hola Mundo!";
        
        String cadena = "Leonardo Bustamante";
        char  ch = 'c';
                System.out.println(miCadena);
         */

 /*String  cadena = sc.nextLine();
        
        System.out.println(cadena);*/
        
        System.out.println("Ingrese la cadena1:");
        String cadena = sc.nextLine();
        System.out.println("Ingrese la cadena2:");
        String cadena2 = sc.nextLine();
        
//        System.out.println(compareCadenas(cadena2));
//        System.out.println(cadena2.toUpperCase());
    
        //System.out.println(cadena.contains(cadena2));
        //System.out.println(cadena.toUpperCase().contains(cadena2.toUpperCase()));
        
        //System.out.println(cadena.charAt(5));
        //System.out.println(cadena2.charAt(5));
        
        //System.out.println(cadena.substring(4, 8));
        extraerDatos(cadena);
        extraerDatos(cadena2);
    }
}
