/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;
import model.Libro;
import java.util.List;

/**
 *
 * @author leobusta
 */
public interface ILibroDAO {
    public List <Libro> obtenerLibros();
    public Libro obtenerLibro(int id);
    public void actualizarLibro(Libro libro);
    public void eliminarLibro(int id);
    public void crearLibro(Libro libro);
}
