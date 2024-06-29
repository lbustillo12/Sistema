/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema;

/**
 *
 * @author Lizy Bustillo
 */

    abstract class Vehiculo implements Aseguranza {
    private String marca;
    private String modelo;
    private int año;
    private double precioRenta;

    public Vehiculo(String marca, String modelo, int año, double precioRenta) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.precioRenta = precioRenta;
    }

    public abstract double calcularCostoRenta(int dias);

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public double getPrecioRenta() {
        return precioRenta;
    }

    public void setPrecioRenta(double precioRenta) {
        this.precioRenta = precioRenta;
    }
}

  
