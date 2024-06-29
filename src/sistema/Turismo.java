/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema;

/**
 *
 * @author Lizy Bustillo
 */
public class Turismo extends Vehiculo {
    private int numeroPuertas;

    public Turismo(String marca, String modelo, int año, double precioRenta, int numeroPuertas) {
        super(marca, modelo, año, precioRenta);
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public double calcularCostoRenta(int dias) {
        return getPrecioRenta() * dias;
    }

    @Override
    public double calcularCostoAseguranza() {
        return getAño() * 0.01 * getPrecioRenta();
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }
}