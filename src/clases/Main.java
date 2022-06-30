package clases;

/**
 *
 * @author leobusta
 */
public class Main {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Perro miperro = new Perro(5,"toby", "azul");
//        Perro tuperro = new Perro(8,"tyson", "café");
//        Perro elperro = new Perro(3,"bruno", "verde");
//        
//        //miperro.ladrar();
        String algo="paola";
        miperro.saludar(algo);
        miperro.saludar();
        int entero = 6;
        miperro.saludar(entero);
        
//        //System.out.println(miperro);
//        
//        miperro.quienEsMayor(tuperro);
               
 //         Persona persona1 = new Persona("Pepito", 25,'H',75,1.8);
          
 //         System.out.println("El IMC de "+persona1.nombre+" es "+persona1.calcularIMC());
        
    }
    
}
