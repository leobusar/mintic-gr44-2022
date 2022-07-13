/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package colecciones;

import java.util.ArrayList;
import java.util.Vector;

/**
 *
 * @author leobusta
 */
public class Listas {

    public static void arraylist() {
        ArrayList<Integer> lista = new ArrayList<>();

        lista.add(5);
        lista.add(3);
        //lista.add("Nota");
        for (int i = 10; i <= 20; i++) {
            lista.add(i);
        }

        System.out.println(lista.size());
        System.out.println(lista);
        lista.remove(5); // elimina el elemento en la posición 5
        lista.remove((Integer) 5); // Integer para eliminar el elemento y no la posición.

        System.out.println(lista);

        lista.add(4, 1000);

        //System.out.println(((String)lista.get(2)).length());
        for (int i = 0; i < lista.size(); i++) {
            System.out.print(lista.get(i) + " ");
        }

        lista.set(4, 13);
        lista.set(5, 50);
        System.out.println("\n---------------");
        for (Integer elem : lista) {
            System.out.print(elem + " ");
        }
        System.out.println("\n" + lista.indexOf(50));
        if (lista.indexOf(50) == -1) {
            System.out.println("El elemento no se encuentra");
        } else {
            System.out.println("Si se encuentra el elemento");
        }

    }

    public static void vector() {
        // Vector para almacenar cualquier tipo
        Vector vector = new Vector();
        
        // agregar elementos de distinto tipo
        vector.add(1);
        vector.add(true);
        vector.add("Mision");
        vector.add("TIC");
        vector.add(2.05);
        System.out.println("Vector 1: " + vector);
        
        // modificar el valor de uno de los elementos
        vector.set(0, 2021);
        System.out.println("Vector 2: " + vector);
        
        // eliminar elemento en el ´ındice 4
        vector.remove(4);
        System.out.println("Vector 3: " + vector);
        
        // impresi´on de elementos con ciclo por elemento
        for (Object elemento : vector) {
            System.out.print(elemento + " ; ");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //arraylist();
        vector();
    }

}
