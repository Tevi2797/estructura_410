/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Actividad_6;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author esteb
 */
public class Array_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        Random rnd=new Random();
        int datos[];
        int t=0;
        
        System.out.println("Inserta la longitud del array");
        t=sc.nextInt();
        
        datos=new int[t];
        
        for (int i = 0; i < datos.length; i++) {
            datos[i]=rnd.nextInt(100);
        }
        for (int i = 0; i < datos.length; i++) {
            System.out.println((i+1)+".- "+datos[i]);
        }
    }
    
}
