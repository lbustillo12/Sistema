/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema;

/**
 *
 * @author Lizy Bustillo
 */
public class Moto extends Vehiculo {
    private double capacidadMotor;

    public Moto(String marca, String modelo, int año, double precioRenta, double capacidadMotor) {
        super(marca, modelo, año, precioRenta);
        this.capacidadMotor = capacidadMotor;
    }

    @Override
    public double calcularCostoRenta(int dias) {
        return getPrecioRenta() * dias * 0.8; // Descuento del 20%
    }

    @Override
    public double calcularCostoAseguranza() {
        return getAño() * 0.005 * getPrecioRenta();
    }

    public double getCapacidadMotor() {
        return capacidadMotor;
    }

    public void setCapacidadMotor(double capacidadMotor) {
        this.capacidadMotor = capacidadMotor;
    }
}
