/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Actividad_9;

/**
 *
 * @author esteb
 */
public class Pasajero {
   private String nombre;
   private int edad;
   private int costo;

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }
    
   
    Pasajero(){
        
    }
    Pasajero(String n,int e, int c){
        this.nombre=n;
        this.edad=e;
        this.costo=c;
    }
    
    public void setNombre (String n){
    this.nombre=n;
    }
    public String getNombre(){
    return this.nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    
}
