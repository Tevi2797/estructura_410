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
public class Auto {
    private Pasajero asientos[];
    int i;
   Auto(){
   asientos=new Pasajero[45];
   }
   public void addPasajero(int i,Pasajero p){
       
           if (this.asientos[i]==null) {
               this.asientos[i]=p;
               
           }else{
               System.out.println("asiento "+this.asientos[i]+ " esta ocupado seleccione otro asiento ");
           }
       
   
   
   }
   
   public void imprimirPasajeros(){
   
       for ( i = 0; i < asientos.length; i++) {
           if (this.asientos[i]==null) {
               System.out.println("Asiento disponible");
               
           }else{
           System.out.println((i+1)+".- ocupado por "+this.asientos[i].getNombre()+" edad "+this.asientos[i].getEdad()+" costo del boleto "+this.asientos[i].getCosto());
           }
       }
   }
    
}
