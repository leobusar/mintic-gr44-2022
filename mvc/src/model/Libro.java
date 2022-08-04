/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author leobusta
 */
public class Libro {
    private int libId;
    private String libNombre; 
    private int libPub;
    private int ediId; 
    private int autId;
    private double precio;

    public Libro(int libId, String libNombre, int libPub, int ediId, int autId, double precio) {
        this.libId = libId;
        this.libNombre = libNombre;
        this.libPub = libPub;
        this.ediId = ediId;
        this.autId = autId;
        this.precio = precio;
    }


    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getLibId() {
        return libId;
    }

    public void setLibId(int libId) {
        this.libId = libId;
    }

    public String getLibNombre() {
        return libNombre;
    }

    public void setLibNombre(String libNombre) {
        this.libNombre = libNombre;
    }

    public int getLibPub() {
        return libPub;
    }

    public void setLibPub(int libPub) {
        this.libPub = libPub;
    }

    public int getEdiId() {
        return ediId;
    }

    public void setEdiId(int ediId) {
        this.ediId = ediId;
    }

    public int getAutId() {
        return autId;
    }

    public void setAutId(int autId) {
        this.autId = autId;
    }
    
}
