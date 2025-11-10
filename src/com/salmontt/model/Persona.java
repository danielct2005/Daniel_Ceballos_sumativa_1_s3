package com.salmontt.model;

/**
 * Clase base que representa a una persona en la organización.
 * Contiene una Dirección (Composición).
 */
public class Persona {

    // Atributos privados (encapsulados)
    private String rut;
    private String nombre;
    private String apellido;

    // Atributo de Composición: Persona "tiene una" Direccion
    private Direccion direccion;

    /**
     * Constructor para la clase Persona.
     *
     * @param rut       El RUT de la persona.
     * @param nombre    El nombre de la persona.
     * @param apellido  El apellido de la persona.
     * @param direccion El objeto Direccion asociado a la persona.
     */
    public Persona(String rut, String nombre, String apellido, Direccion direccion) {
        this.rut = rut;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
    }

    // --- Getters y Setters ---

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    /**
     * Devuelve una representación en cadena de la persona.
     *
     * @return Una cadena con los datos de la persona.
     */
    @Override
    public String toString() {
        return "Persona [\n" +
                "  RUT: " + rut + ",\n" +
                "  Nombre: " + nombre + " " + apellido + ",\n" +
                "  Dirección: " + direccion.toString() + "\n" +
                "]";
    }
}