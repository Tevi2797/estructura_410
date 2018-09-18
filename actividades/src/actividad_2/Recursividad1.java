/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad_2;

/**
 *
 * @author esteb
 */
public class Recursividad1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       int n=0; //se declara el numero que se quiere factorizar 
        System.out.println(factorial(n));
    }
     static long factorial(int n){
            if (n==0){
                return 1;
            }else{
            return n*factorial(n-1);
            }
    
    }
}
