/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import model.Libro;
import utils.Conexion;

/**
 *
 * @author leobusta
 */
public class LibroDAOJDBCImpl implements ILibroDAO {

    @Override
    public List<Libro> obtenerLibros() {

        List<Libro> libros = new ArrayList();

        try {

            Connection conn = Conexion.getConnection();
            String sql = "SELECT * FROM libro";
            Statement statement = conn.createStatement();
            ResultSet result = statement.executeQuery(sql);

            while (result.next()) {
                Libro libro = new Libro(result.getInt("libId"), result.getString("libNombre"),
                        result.getInt("libPub"), result.getInt("ediId"), result.getInt("autId"),
                        result.getDouble("libPrecio"));
                libros.add(libro);
            }

        } catch (SQLException ex) {
            System.out.println("Error consultando");
            System.out.println(ex);
        }
        return libros;
    }

    @Override
    public Libro obtenerLibro(int id) {
        Libro libro = null;

        try {

            Connection conn = Conexion.getConnection();
            String sql = " SELECT * FROM libro WHERE libId=?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setInt(1, id);
            ResultSet result = statement.executeQuery();

            while (result.next()) {
                libro = new Libro(result.getInt("libId"), result.getString("libNombre"),
                        result.getInt("libPub"), result.getInt("ediId"), result.getInt("autId"),
                        result.getDouble("libPrecio"));
            }

        } catch (SQLException ex) {
            System.out.println("Error consultando");
            System.out.println(ex);
        }
        return libro;

    }

    @Override
    public void actualizarLibro(Libro libro) {
        try {
            Connection conn = Conexion.getConnection();
            String sql = " UPDATE libro SET libNombre =? , libPub =? , libPrecio =? WHERE libId =?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, libro.getLibNombre());
            statement.setInt(2, libro.getLibPub());
            statement.setDouble(3, libro.getPrecio());
            statement.setInt(4, libro.getLibId());
            int rowsUpdated = statement.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("El registro fue  actualizado exitosamente !");
            }
        } catch (SQLException ex) {
            System.out.println("No actualizado");
            System.out.println(ex);
        }
    }

    @Override
    public void eliminarLibro(int id) {
        try {
            Connection conn = Conexion.getConnection();
            String sql = " DELETE FROM libro WHERE libId =?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setInt(1, id);
            int rowsDeleted = statement.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println(" Borrado exitoso !");
            }
        } catch (SQLException ex) {
            System.out.println("No actualizado");
            System.out.println(ex);
        }
    }

    @Override
    public void crearLibro(Libro libro) {
        try {
            Connection conn = Conexion.getConnection();
            
            String sql = "INSERT INTO libro (libId , libNombre,libPub, ediId, autId ,libPrecio ) VALUES (? ,? , ? , ? , ? , ?)";
            PreparedStatement statement = conn.prepareStatement(sql); 
            statement.setInt(1,libro.getLibId());
            statement.setString(2,libro.getLibNombre());
            statement.setInt(3, libro.getLibPub());
            statement.setInt(4, libro.getEdiId());
            statement.setInt(5, libro.getAutId());
            statement.setDouble(6, libro.getPrecio());
            int n = statement.executeUpdate();
            if(n > 0)
                System.out.println("Libro ha sido creado.");
        } catch (SQLException ex) {
            System.out.println("No insertado");
            System.out.println(ex);           
        }
    }

}
