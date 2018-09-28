/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Actividad_8;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author esteb
 */
public class ahor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Random rnd = new Random();
        char letra;
        int contador = 0;
        char respuesta[];
        String palabras[] = {"java", "PHP", "Python", "visual", "java script", "html"};
        String palabra = palabras[0];

        respuesta = new char[palabra.length()];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < palabra.length(); i++) {
            respuesta[i] = '_';

        }
        for (int i = 0; i < palabra.length(); i++) {
            System.out.println(respuesta[i] + "");
        }
        while (contador < palabra.length()) {
            System.out.println("Inserte una letra");
            letra = sc.next().charAt(0);

            for (int i = 0; i < palabra.length(); i++) {
                if (palabra.charAt(i) == letra) {
                    respuesta[i] = letra;
                    contador++;
                }
            }
            for (int i = 0; i < palabra.length(); i++) {
                System.out.print(respuesta[i] + "");
            }
        }

    }

}
