/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package equipos;
import java.util.ArrayList;

/**
 *
 * @author leobusta
 */
public class Torneo {
    
    public ArrayList<Integer> miequipo (ArrayList<Integer> posiciones,  ArrayList<String> equipos, String equipo ){
        ArrayList<Integer> lista = new ArrayList<>();
        
//        for(int i = 0; i < posiciones.size(); i++){
//            int pos = posiciones.get(i);
        for(int pos: posiciones){
            if( equipos.get(pos).equals(equipo)  ){
                lista.add(pos);
            }
        }
        return lista;
    }
    
}
