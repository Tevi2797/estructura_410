/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Actividad_3;
import java.util.Scanner;
/**
 *
 * @author esteb
 */
public class Array2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        float max[]=new float[7];
        float min[]=new float[7];
        String dias[]={"Lunes","Martes","Miercoles","Juevez","Viernes","Sabado","Domingo"};
        float tmax=0,tmin=0,pmax=0,pmin=0;
        int dmax=0,dmin=0;
        for (int i = 0; i < 7; i++) {
            System.out.println("Inserta la tempertura maxima del dia "+dias[i]);
            max[i]=sc.nextFloat();
            pmax=pmax+max[i];
            if (max[i]>tmax) {
                tmax=max[i];
                dmax=i;
                
            }
            System.out.println("Inserta la temperatura minima del dia "+dias[i]);
            min[i]=sc.nextFloat();
            pmin=pmin+min[i];
            if (i==0) {
                tmin=min[i];
                
            }
            else if(min[i]<tmin){
                tmin=min[i];
                dmin=i;
            
            }
        }
        
        System.out.println("Temperatura promedio maxima de la semana es: "+(pmax/7));
        System.out.println("Temperatura promedio minimo de la semana es: "+(pmin/7));
        System.out.println("____________________________________________");
        for (int i = 0; i < 7; i++) {
            System.out.println("Temperatura maxima del dia "+dias[i]+" = "+max[i]);
            System.out.println("Temperatura minima del dia "+dias[i]+" = "+min[i]);
        }
        System.out.println("___________________________________________");
        System.out.println("La Temperatura maxima de la semana fue el dia "+dias[dmax]+" con "+tmax);
        System.out.println("La Temperatura minima de la semana fue el dia "+dias[dmin]+" con "+tmin);
    }
    
}
