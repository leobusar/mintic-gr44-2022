/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import view.AutorView;

/**
 *
 * @author leobusta
 */
public class AutorController {
    
    AutorView vista;

    public AutorController() {
        this.vista = new AutorView();
    }    
    
    public void administrarAutor(){
        int opcion = vista.menuAutor();
        
        switch(opcion){
            case 1: 
                System.out.println("Crear Autor");
                break;
            case 2:
            case 4:
            case 5:
                System.out.println("No implementada");
                break;
            case 3: 
                System.out.println("Listar Autor");
            
        }
    }
}
