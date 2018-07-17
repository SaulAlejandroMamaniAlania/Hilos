/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ALEJANDRO
 */
public class Cajera {
  private String nombre;

    public Cajera(String n) {
        this.nombre = n;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
  
    public void ProcesarCompra(Cliente cliente,long timeStamp){
        System.out.println("La cajera: " + this.nombre+ "COMINEZA A PROCESAR LA COMPRA DEL CLIENTE " + cliente.getNombre()+ "EN EL TIEMPO" +
                (System.currentTimeMillis() - timeStamp) /1000 + "seg");
        for (int i = 0; i < cliente.getCarroCompra().length; i++) {
            this.EsperarXsegundos(cliente.getCarroCompra()[i]);
            System.out.println("Ptocesando el producto : " +( i + 1)+
            "-> Tiempo : " + (System.currentTimeMillis()-timeStamp)/1000 + "seg");
            
        }
        System.out.println("La cajera" + this.nombre+ "HA TERMINADO DE PROCESAR"+ cliente.getNombre()+ " EN EL TIEMPO:  " + 
                (System.currentTimeMillis()-timeStamp)/1000 + "seg");
    }
    
    public void EsperarXsegundos(int segundos){
        try {
                Thread.sleep(segundos * 1000);
        } catch (InterruptedException ex) { 
          Thread.currentThread().interrupt();
      } 
             
    }
    
    
}
