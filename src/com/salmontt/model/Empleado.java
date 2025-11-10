package com.salmontt.model;

/**
 * Clase que representa a un Empleado.
 * Hereda de la clase Persona (Herencia).
 */
public class Empleado extends Persona {

    // Atributos propios de Empleado
    private String idEmpleado;
    private String cargo;
    private double salario;

    /**
     * Constructor para la clase Empleado.
     * Llama al constructor de la superclase (Persona).
     *
     * @param rut        El RUT del empleado (heredado).
     * @param nombre     El nombre del empleado (heredado).
     * @param apellido   El apellido del empleado (heredado).
     * @param direccion  La dirección del empleado (heredada).
     * @param idEmpleado El ID único del empleado.
     * @param cargo      El puesto de trabajo del empleado.
     * @param salario    El salario del empleado.
     */
    public Empleado(String rut, String nombre, String apellido, Direccion direccion,
                    String idEmpleado, String cargo, double salario) {

        // 1. Llama al constructor de la clase padre (Persona)
        super(rut, nombre, apellido, direccion);

        // 2. Inicializa los atributos propios de Empleado
        this.idEmpleado = idEmpleado;
        this.cargo = cargo;
        this.salario = salario;
    }

    // --- Getters y Setters para atributos propios ---

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    /**
     * Sobrescribe el método toString() para incluir la información del empleado.
     * Reutiliza el toString() de la clase padre (Persona).
     *
     * @return Una cadena con los datos completos del empleado.
     */
    @Override
    public String toString() {
        // Obtenemos la información base de la clase Persona
        String infoPersona = super.toString();

        // Quitamos el ']' final de Persona para agregar más datos
        infoPersona = infoPersona.substring(0, infoPersona.length() - 1);

        // Agregamos la información específica de Empleado
        return infoPersona +
                "  --- Empleado ---\n" +
                "  ID Empleado: " + idEmpleado + ",\n" +
                "  Cargo: " + cargo + ",\n" +
                "  Salario: $" + String.format("%,.0f", salario) + "\n" +
                "]";
    }
}