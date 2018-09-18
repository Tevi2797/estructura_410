/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Actividad_5;
import java.util.Scanner;
/**
 *
 * @author esteb
 */
public class Clima {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc=new Scanner(System.in);
       
        Temperaturas t=new Temperaturas();
        for (int i = 0; i < 7; i++) {
             Grados g=new Grados();           
            System.out.println("Inserta la temperatura Maxima del dia ");
            g.setMaximo(sc.nextFloat());
            System.out.println("Inserte la temperatura minima ");
            g.setMinimo(sc.nextFloat());
            t.addTemperaturas(i, g);
        }
        System.out.println("Temperatura maxima de la semana "+t.getMaxima());
    }
    
}
