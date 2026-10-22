/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jesabepoproyectos1.java;

/**
 *
 * @author Sala de Sistemas
 */
public class estudiante {
    
    private String nombre;
    private String apellido;
    private int edad;
    
    public estudiante(String nombre, String apellido, int edad){
        
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        
    }
    

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public String imprimir_datos(){
        return ("el nombre es:"+getNombre()+"\nel apellido es:"+getApellido()+"\nla edad es:"+getEdad());
    }
    
}
