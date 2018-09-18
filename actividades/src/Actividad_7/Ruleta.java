
package Actividad_7;

import java.util.Random;
import java.util.Scanner;

public class Ruleta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random rnd=new Random();
        // TODO code application logic here
        String numeros[]=new String[32];
        int apuesta=0,cartera=500,cantidad=0,resultado=0;
        int tipo=0;//tipo de apuesta puede ser numero=0 o color=1 
        
        numeros[0]="Verde";
        
        for (int i = 1; i < 32; i++) {
            if (i%2==0) {
                numeros[i]="Negro";
            }
            else{
                numeros[i]="Rojo";
            }
        }
        
        for (int i = 0; i < 30; i++) {
            System.out.println(i+".- "+numeros[i]);
        }
        
        System.out.println("Tu credito es de "+cartera);
        System.out.println("¿Quieres apostar a un numero=0 o a un color=1");
            tipo=sc.nextInt();
            if (tipo==0) {
            System.out.println("Selecciona entre 0 y 31");
        cantidad=sc.nextInt();
        }else{
                System.out.println("selecciona un color verde=0 Rojo=1 Negro=2");
                cantidad=sc.nextInt();
            }
            
            
        
        System.out.println("Cuanto quieres apostar");
        apuesta=sc.nextInt();
        
        
        resultado=rnd.nextInt(32);
        System.out.println("Resultado: "+resultado);
        System.out.println("Color: "+numeros[resultado]);
        
        if (tipo==0) {
            if (resultado==apuesta) {
            cartera=cartera+(apuesta*32);
            System.out.println("Flicidades:D");
        }
        else{
        cartera=cartera-apuesta;
                System.out.println("Perdiste ;D");
                
        }
        }else{
        switch(cantidad){
            case 0:
                if (numeros[resultado].equals("Verde")) {
                    cartera=cartera+apuesta;
                }
                else{
                cartera=cartera-apuesta;
                
                }
                break;
            case 1:
                if (numeros[resultado].equals("Rojo")) {
                    cartera=cartera+apuesta;
                }
                else{
                cartera=cartera-apuesta;
                
                }
                break;
            case 2:
                if (numeros[resultado].equals("Negro")) {
                    cartera=cartera+apuesta;
                }
                else{
                cartera=cartera-apuesta;
                
                }
                break;    
        }
        }
            
        System.out.println("Tu credito actual es de: "+cartera);
        
        
    }
    
}
