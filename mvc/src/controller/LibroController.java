/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.ILibroDAO;
import dao.LibroDAOJDBCImpl;
import java.util.List;
import model.Libro;
import view.LibroView;

/**
 *
 * @author leobusta
 */
public class LibroController {
    private LibroView vista;
    private ILibroDAO libroDAO;

    public LibroController() {
        this.vista = new LibroView();
        this.libroDAO = new LibroDAOJDBCImpl();
    }

    public LibroView getVista() {
        return vista;
    }
    
    public void actualizarVista(){
        List<Libro> libros = libroDAO.obtenerLibros();
        vista.mostrarLibros(libros);
    }
    
    public void crearLibro(){
        Libro libro = vista.libroForm();
        libroDAO.crearLibro(libro);
    }
    
    public void administrarLibro(){
        int opcion = vista.menuLibros();
        
        switch(opcion){
            case 1: 
                this.crearLibro();
                break;
            case 2:
            case 4:
            case 5:
                System.out.println("No implementada");
                break;
            case 3: 
                this.actualizarVista();
            
        }
    }
}