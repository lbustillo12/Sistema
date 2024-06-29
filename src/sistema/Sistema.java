/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistema;

/**
 *
 * @author Lizy Bustillo
 */
public class Sistema {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        Turismo turismo = new Turismo("Toyota", "Corolla", 2020, 50, 4);
        Camion camion = new Camion("Ford", "F-150", 2018, 70, 1000);
        Moto moto = new Moto("Honda", "CBR", 2022, 30, 600);

        int diasAlquiler = 4;

        System.out.println("===================================");
        System.out.println("             Turismo");
        System.out.println("===================================");
        System.out.println("Marca: " + turismo.getMarca());
        System.out.println("Modelo: " + turismo.getModelo());
        System.out.println("Anio: " + turismo.getAño());
        System.out.println("Costo de renta por " + diasAlquiler + " dias: L." + turismo.calcularCostoRenta(diasAlquiler));
        System.out.println("Costo de aseguranza: L." + turismo.calcularCostoAseguranza());

        System.out.println("\n===================================");
        System.out.println("               Camion");
        System.out.println("===================================");
        System.out.println("Marca: " + camion.getMarca());
        System.out.println("Modelo: " + camion.getModelo());
        System.out.println("Anio: " + camion.getAño());
        System.out.println("Costo de renta por " + diasAlquiler + " dias: L." + camion.calcularCostoRenta(diasAlquiler));
        System.out.println("Costo de aseguranza: L." + camion.calcularCostoAseguranza());

        System.out.println("\n===================================");
        System.out.println("               Moto");
        System.out.println("===================================");
        System.out.println("Marca: " + moto.getMarca());
        System.out.println("Modelo: " + moto.getModelo());
        System.out.println("Anio: " + moto.getAño());
        System.out.println("Costo de renta por " + diasAlquiler + " dias: L." + moto.calcularCostoRenta(diasAlquiler));
        System.out.println("Costo de aseguranza: L." + moto.calcularCostoAseguranza());
    }
   
   
    
}
