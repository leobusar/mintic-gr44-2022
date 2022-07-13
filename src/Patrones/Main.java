/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Patrones;

/**
 *
 * @author leobusta
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//        Caja caja = new Caja(100);
//        String s = caja.decorar();
//        //System.out.println(((String) caja.obtener()).length());
//        System.out.println(( (Integer) caja.obtener()) + 50);
//        System.out.println(s);
//        Caja2<Integer> caja = new Caja2<Integer>(100);
//        String s = caja.decorar();
//        //System.out.println(((String) caja.obtener()).length());
//        System.out.println(caja.obtener() + 50);
//        System.out.println(s);
//
//        String[] cadenas = {"prueba", "test"};
//        Caja2<String[]> caja2 = new Caja2<String[]>(cadenas);
//        String str = caja2.decorar();
//        System.out.println(caja2.obtener().length);
//        System.out.println(str);

        Pareja<Integer, String> pareja = new Pareja<Integer, String>(20, "Pedro Paramo");
        System.out.println(pareja);
        Integer c = pareja.clave() + 10;
        System.out.println(c);
        System.out.println(pareja.valor().charAt(2));
    }

}
