/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;
import java.util.Scanner;
/**
 *
 * @author esteb
 */
public class Calificaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        float cal[]=new float[5];
        float cmax=0 ,cmin=0,pro=0,calim=0;
        
        String materias[]={"Ingenieria del software","Desarrollo de aplicaciones","Estructura de datos","Administracion de bases de datos","Ingles"};
        for (int i = 0; i < 5; i++) {
           System.out.println("Inserte la calificacion para "+materias[i]); 
            cal[i]=sc.nextFloat();
            pro=pro+cal[i];
             if (cal[i]>cmax) {
            cmax=cal[i];
            
            }
             if (cal[i]<cmin) {
                cmin=cal[i];
            }
        }
        for (int i = 0; i < 5; i++) {
           System.out.println(cal[i]); 
           
        }
        System.out.println("La calificacion minima es min"+cmin);
        System.out.println("max"+cmax);
        System.out.println("promedio"+(pro/5));
    }
    
}
