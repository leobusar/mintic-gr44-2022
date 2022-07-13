/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package colecciones;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author leobusta
 */
public class Maps {

    public static void hashmap() {
        HashMap<String, Double> mapa = new HashMap<>();

        // agregar elementos
        mapa.put("nota 1", 5.0);
        mapa.put("nota 2", 5.0);
        mapa.put("nota 3", 2.5);

        System.out.println(mapa.size());
        System.out.println("Mapa: " + mapa);

        if (mapa.containsKey("nota 1")) {
            System.out.println(mapa.get("nota 1"));
        }

        for (Map.Entry<String, Double> elem : mapa.entrySet()) {
            System.out.println(elem.getKey() + ": " + elem.getValue());
        }

        double promedio = 0;
        for (Double elem : mapa.values()) {
            promedio += elem;
        }

        System.out.println("Promedio:" + (promedio / mapa.size()));
    }

    public static void treemap() {
        // Creaci´on del TreeMap
        TreeMap<Integer, String> mapa = new TreeMap<Integer, String>();
        
        // Agregar elementos
        mapa.put(3, "MisionTIC");
        mapa.put(2, "estudiantes");
        mapa.put(1, "hola");
        for (Map.Entry pareja : mapa.entrySet()) {
            int clave = (int) pareja.getKey();
            String valor = (String) pareja.getValue();
            System.out.println(clave + " : " + valor);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //hashmap();
        treemap();
    }

}
