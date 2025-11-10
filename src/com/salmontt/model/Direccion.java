package com.salmontt.model;

/**
 * Representa una dirección física.
 * Esta clase se utiliza como componente en otras clases (Composición).
 */
public class Direccion {

    // Atributos privados para encapsulamiento
    private String calle;
    private String numero;
    private String comuna;
    private String ciudad;

    /**
     * Constructor para inicializar un objeto Direccion.
     *
     * @param calle   El nombre de la calle.
     * @param numero  El número de la dirección.
     * @param comuna  La comuna.
     * @param ciudad  La ciudad.
     */
    public Direccion(String calle, String numero, String comuna, String ciudad) {
        this.calle = calle;
        this.numero = numero;
        this.comuna = comuna;
        this.ciudad = ciudad;
    }

    // --- Getters y Setters ---

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    /**
     * Devuelve una representación en cadena de la dirección.
     *
     * @return Una cadena formateada con la dirección completa.
     */
    @Override
    public String toString() {
        return calle + " #" + numero + ", " + comuna + ", " + ciudad;
    }
}