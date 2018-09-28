/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Actividad_10;
import java.util.*;
/**
 *
 * @author esteb
 */
public class Matrices {

    /**
     * @param args the command line arguments
     */ static char gato[][]=new char[3][3];
     static int jugadas=0;
    public static void main(String[] args) {
        // TODO code application logic here
        int tiro=0;
        Scanner sc= new Scanner(System.in);
            gato [0][0]='1';
            gato [0][1]='2';
            gato [0][2]='3';
            gato [1][0]='4';
            gato [1][1]='5'; 
            gato [1][2]='6';
            gato [2][0]='7';
            gato [2][1]='8';
            gato [2][2]='9';
        dibujar();
        while  (jugadas<9) {
        System.out.println("Turno del jugador 1= X");
        System.out.println("Selecciona tu jugada ");
        tiro=sc.nextInt();
        addGato(tiro,'X');
        jugadas ++;
        dibujar();
        ganador();
        
            if (jugadas<9) {
                
            
        System.out.println("Turno del jugador 2= O");
        System.out.println("Selecciona tu jugada ");
        tiro=sc.nextInt();
        addGato(tiro,'O');
        jugadas ++;
        dibujar();
            }
    }
    }
    public static void ganador(){
        if (gato[0][0]==gato[0][1]&& gato[0][0]==gato[0][2]) {
            System.out.println("El jugador "+gato[0][0]+" es el ganador ");
            jugadas=10;
        }
        if (gato[1][0]==gato[1][0]&& gato[1][0]==gato[1][2]) {
            System.out.println("El jugador "+gato[1][0]+" es el ganador ");
            jugadas=10;
        }
        if (gato[2][0]==gato[2][1]&& gato[2][0]==gato[2][2]) {
            System.out.println("El jugador "+gato[2][0]+" es el ganador ");
            jugadas=10;
        }
////    ___________________________________________________________________
        if (gato[0][0]==gato[1][0]&& gato[0][0]==gato[2][0]) {
            System.out.println("El jugador "+gato[0][0]+" es el ganador ");
            jugadas=10;
        }
        if (gato[0][1]==gato[1][1]&& gato[0][1]==gato[2][1]) {
            System.out.println("El jugador "+gato[0][1]+" es el ganador ");
            jugadas=10;
        }
        if (gato[0][2]==gato[1][2]&& gato[0][21]==gato[2][2]) {
            System.out.println("El jugador "+gato[0][0]+" es el ganador ");
            jugadas=10;
        }
//        ____________________________________________________________________
        if (gato[0][0]==gato[1][1]&& gato[0][0]==gato[2][2]) {
            System.out.println("El jugador "+gato[0][0]+" es el ganador ");
            jugadas=10;
        }
        if (gato[0][2]==gato[1][1]&& gato[0][2]==gato[2][0]) {
            System.out.println("El jugador "+gato[0][2]+" es el ganador ");
            jugadas=10;
        }
        
    }
    public static void addGato(int x,char j){
    switch (x){
        case 1:
            gato[0][0]=j;
            break;
            
        case 2:
            gato[0][1]=j;
            break;
        case 3:
            gato[0][2]=j;
            break;
        case 4:
            gato[1][0]=j;
            break;
        case 5:
            gato[1][1]=j;
            break;
        case 6:
            gato[1][2]=j;
            break;
        case 7:
            gato[2][0]=j;
            break;
        case 8:
            gato[2][1]=j;
            break;
        case 9:
            gato[2][2]=j;    
            break;
    }
    
    }
    public static void dibujar (){
        for (int i = 0; i < 3; i++) {
            String fila="   ";
            System.out.println("      |     |     ");
            for (int j = 0; j < 3; j++) {
                if (j<2) {
                    fila+=gato[i][j]+"  |  ";
                }
                else{
                    fila+=gato[i][j]+"     ";
                }
                
            }
            System.out.println(fila);
            if (i<2) {
                System.out.println("------|-----|------");
            }else{
                System.out.println("      |     |      ");
            }
            
        }
        
       
    
    }
}
