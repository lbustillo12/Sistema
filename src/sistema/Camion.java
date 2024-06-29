/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema;

/**
 *
 * @author Lizy Bustillo
 */
class Camion extends Vehiculo {
    private double capacidadDeCarga;

    public Camion(String marca, String modelo, int año, double precioRenta, double capacidadDeCarga) {
        super(marca, modelo, año, precioRenta);
        this.capacidadDeCarga = capacidadDeCarga;
    }

    @Override
    public double calcularCostoRenta(int dias) {
        return getPrecioRenta() * dias * 1.2; // Recargo del 20%
    }

    @Override
    public double calcularCostoAseguranza() {
        return getAño() * 0.015 * getPrecioRenta();
    }

    public double getCapacidadDeCarga() {
        return capacidadDeCarga;
    }

    public void setCapacidadDeCarga(double capacidadDeCarga) {
        this.capacidadDeCarga = capacidadDeCarga;
    }
}


