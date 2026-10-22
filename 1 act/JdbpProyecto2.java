/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.jdbpproyecto2;

/**
 *
 * @author Sala de Sistemas
 */
public class JdbpProyecto2 {

    
        private String nombre;
        private String apellido;
        private int numero_de_telefono;
        private int numero_de_cedula;
        private String correo;
        private String direccion;
        private int fecha_de_nacimiento;
        private int edad;
        
        public JdbpProyecto2(String nombre, String apellido, int numero_de_telefono, int numero_de_cedula, String correo, String direccion, int fecha_de_nacimiento, int edad){
            
            this.nombre = nombre;
            this.apellido = apellido;
            this.numero_de_telefono = numero_de_telefono;
            this.numero_de_cedula = numero_de_cedula;
            this.correo = correo;
            this.direccion = direccion;
            this.fecha_de_nacimiento = fecha_de_nacimiento;
            this.edad = edad-2024;
            
        }

    
    public String imprimir_datos(){
        return ("El nombre es:"+getNombre()+"\nEl apellido es:"+getApellido()+"\nEl numero de telefono es:"+getNumero_de_telefono()+"\nEl numero de la cedula es:"+getNumero_de_cedula()+"\nEl correo es:"+getCorreo()+"\nLa direccion es:"+getDireccion()+"\nLa fecha de nacimiento es:"+getFecha_de_nacimiento()+"\nLa edad es:");
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
     * @return the numero_de_telefono
     */
    public int getNumero_de_telefono() {
        return numero_de_telefono;
    }

    /**
     * @param numero_de_telefono the numero_de_telefono to set
     */
    public void setNumero_de_telefono(int numero_de_telefono) {
        this.numero_de_telefono = numero_de_telefono;
    }

    /**
     * @return the numero_de_cedula
     */
    public int getNumero_de_cedula() {
        return numero_de_cedula;
    }

    /**
     * @param numero_de_cedula the numero_de_cedula to set
     */
    public void setNumero_de_cedula(int numero_de_cedula) {
        this.numero_de_cedula = numero_de_cedula;
    }

    /**
     * @return the correo
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * @param correo the correo to set
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the fecha_de_nacimiento
     */
    public int getFecha_de_nacimiento() {
        return fecha_de_nacimiento;
    }

    /**
     * @param fecha_de_nacimiento the fecha_de_nacimiento to set
     */
    public void setFecha_de_nacimiento(int fecha_de_nacimiento) {
        this.fecha_de_nacimiento = fecha_de_nacimiento;
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
        
}
