/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Actividad_9;

import java.util.*;
public class Autobus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Auto ado=new Auto();
        Scanner sc = new Scanner(System.in);
        int opcion=0, costo, ganancias=0;
        String nombre;
        char continuar='s',estudiante='s';
        while(continuar=='s'){
        System.out.println("Selecciona una opcion del menu:");
        System.out.println("1.- Imprimir lista de pasajeros ");
        System.out.println("2.- Agregar un pasajero");
        System.out.println("3.- Total de ganancias del dia");
        opcion=sc.nextInt();
        switch (opcion){
            case 1:
                ado.imprimirPasajeros();
                break;
            case 2:
                System.out.println("Inserte el nombre del pasajero ");
                sc.nextLine();
                nombre=sc.nextLine();
                System.out.println("Inserte la edad del pasajero ");
        int edad = sc.nextInt();
                System.out.println("Inserte el costo del boleto ");
                costo=sc.nextInt();
                System.out.println("Inserte el numero de asiento a ocupar");
        int asiento = sc.nextInt();
                System.out.println("El pasajero es estudiante?");
                estudiante=sc.next().charAt(0);
                
                if (estudiante=='s') {
                    costo=costo/2;
                }
                Pasajero p=new Pasajero(nombre,edad,costo);
                ado.addPasajero((asiento-1),p);
                
                break;
            case 3:
                
                break;
            default:System.out.println("no existe");
                
        }     
            System.out.println("Quieres ir al menu principal si='S' o no='N'");
            continuar=sc.next().charAt(0);
        }
    }

    private void imprimirPasajeros() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
