/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aprendendo_vectores_e_matriz;

import java.util.Scanner;

/**
 *
 * @author FATIMA30
 */
public class vet13 {
    public static void main(String[]args){
        Scanner escreva= new Scanner(System.in);
        int[] vetA = new int[10];
        int par=0;
        int impar=0;
        double g ;
        double h;
        
        
        for(int cont=0; cont<vetA.length; cont++){
        
            System.out.println("DIGITE O VALOR DO INDICE: >>"+cont);
            vetA[cont]=escreva.nextInt();
            
            if(vetA[cont]%2==0){
            
                                     par=par+1;
                                       
                
            }
            
            else{
            
                     impar += 1;
                    
            } 
        }
                h=impar/100;
                g=par/100; 
        System.out.print("A PERCENTAGEM DOS NÚMEROS PARES É DE: \n"+g);
        System.out.println("  ");
        System.out.printf("A PERCENTAGEM DOS NÚMEROS IMPARES É DE: \n"+h);
    
    }
}
