/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Actividad_4;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author esteb
 */
public class Monedas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int moneda=0,j=0,cartera=500,apuesta=0;
        String credito="";
        Scanner sc=new Scanner(System.in);
        Random rnd=new Random();
        do{
            moneda=rnd.nextInt(2);
            System.out.println("cuanto quieres apostar");
            apuesta=sc.nextInt();
            if (apuesta<=cartera) {
                apuesta=apuesta;
            }else{
            apuesta=cartera;
            }
            System.out.println("ELIGE Sol(0) o Agula(1)");
            j=sc.nextInt();
            
            if (j==moneda) {
                System.out.println("Felicidades ya ganaste 😊😊😊😊😊");
                cartera=cartera+apuesta;
        }
            else{System.out.println("Periste 😢😢😢😢😢");}
            if (moneda==0) {
                System.out.println("Cayo sol");
                cartera=cartera-apuesta;
            
        }
            
            System.out.println("Tu saldo actual es de "+cartera);
            System.out.println("Continuar con el juego Si(s) no(n)");
            credito=sc.next();
        }while(credito.equals("s")&& cartera>0);
    }
    
}
