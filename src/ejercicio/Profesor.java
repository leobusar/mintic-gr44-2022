/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio;

/**
 *
 * @author leobusta
 */
public class Profesor extends Persona{
    private String nivelAcademico; 
    private String especialidad;
    private int tiempoExperiencia; 

    public Profesor(String nivelAcademico, String especialidad, int tiempoExperiencia, String nombre, String apellidos, int edad) {
        super(nombre, apellidos, edad);
        this.nivelAcademico = nivelAcademico;
        this.especialidad = especialidad;
        this.tiempoExperiencia = tiempoExperiencia;
    }

    public String getNivelAcademico() {
        return nivelAcademico;
    }

    public void setNivelAcademico(String nivelAcademico) {
        this.nivelAcademico = nivelAcademico;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getTiempoExperiencia() {
        return tiempoExperiencia;
    }

    public void setTiempoExperiencia(int tiempoExperiencia) {
        this.tiempoExperiencia = tiempoExperiencia;
    }

    
}
