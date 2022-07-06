/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendavideo;

/**
 *
 * @author leobusta
 */
public class Libro extends Producto {
    private int nro_paginas;

    public Libro(int nro_paginas, String nombre, double precio, String codigo) {
        super(nombre, precio, codigo);
        this.nro_paginas = nro_paginas;
    }
    
    @Override
    public String toString(){
        String output=super.toString();
        
        output += "\nNo Paginas:"+nro_paginas;
        
        return output;
    }
    
}
