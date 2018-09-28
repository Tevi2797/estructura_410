/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ahorcado;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Esteban
 */
public class Ahorcado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();

        String palabras[] = {"java", "php", "python", "visual", "javascript", "html"};
        char letra;
        char respuesta[];
        int contador = 0, errores = 0;

        String palabra = palabras[rnd.nextInt(palabras.length - 1)];
        respuesta = new char[palabra.length()];

        for (int i = 0; i < palabra.length(); i++) {
            respuesta[i] = '_';
        }

        for (int i = 0; i < palabra.length(); i++) {
            System.out.print(respuesta[i] + " ");
        }

        while (contador < palabra.length() && errores < 3) {
            System.out.println("Te quedad " + (3 - errores) + " intentos");
            System.out.println("Inserta una letra: ");
            letra = sc.next().charAt(0);
            int contiene = 0;
            for (int i = 0; i < palabra.length(); i++) {
                if (palabra.charAt(i) == letra) {
                    respuesta[i] = letra;
                    contador++;
                    contiene++;

                }

            }
            if (contiene == 0) {
                errores++;
            }
        
        
        dibujar(errores);
        for (int i = 0; i < palabra.length(); i++) {
            System.out.print(respuesta[i] + " ");
        }
        }
    }
    
    public static void dibujar (int e){
    switch(e){
        case 0:
                System.out.println("------------------------------");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
        break;
        
        case 1:
            System.out.println("----------------------------|");
                System.out.println("                      (-_-)");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                break;
                
                
        case 2:
            System.out.println("----------------------------|");
                System.out.println("                      (-_-)");
                System.out.println("                       /|\\");
                System.out.println("                        |");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                break;
                
                
                
                
        case 3:System.out.println("-------------------------|");
                System.out.println("                        |");
                System.out.println("                      (-_-)");
                System.out.println("                       /|\\");
                System.out.println("                      / | \\");
                System.out.println("                        |");
                System.out.println("                       / \\");
                System.out.println("                      /   \\");
                System.out.println("|");
                System.out.println("Estas Muerto ");
                break;
                
                
        
    }
    
    
    
    }
}
