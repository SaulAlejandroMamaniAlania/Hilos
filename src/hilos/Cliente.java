/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos;

/**
 *
 * @author ALEJANDRO
 */
public class Cliente {
  private String nombre;
  private int[] CarroCompra;

    public Cliente(String nombre, int[] CarroCompra) {
        this.nombre = nombre;
        this.CarroCompra = CarroCompra;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int[] getCarroCompra() {
        return CarroCompra;
    }

    public void setCarroCompra(int[] CarroCompra) {
        this.CarroCompra = CarroCompra;
    }
  
}
