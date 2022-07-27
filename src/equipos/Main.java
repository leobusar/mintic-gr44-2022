/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package equipos;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author leobusta
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> misposiciones =  new ArrayList<>(Arrays.asList(0,1,3,5,6));
        ArrayList<String> losequipos = new ArrayList<>(Arrays.asList("Newpi", "San Francis", "Naughty Boys", "Newpi", "Newpi", "Naughty Boys", "Newpi", "San Francis"));
        
        Torneo mitorneo = new Torneo();
        
        System.out.println(mitorneo.miequipo(misposiciones, losequipos, "Newpi"));
    }
    
}