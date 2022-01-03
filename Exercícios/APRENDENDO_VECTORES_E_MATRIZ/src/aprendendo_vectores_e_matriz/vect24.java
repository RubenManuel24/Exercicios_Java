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
public class vect24 {
    public static void main(String[]args){
        Scanner escreva = new Scanner(System.in);
        long[] A = new long[15];
       long [] B = new long[15];
        long fatorial=1;
        long a = 1;
        int cont;
        System.out.println("DIGITE OS VALRES DO A DO INDICE: ");
        for( cont=0; cont<A.length; cont++){
          A[cont]=escreva.nextInt();}
           
      
           while(a<A[cont]){
             
             fatorial=fatorial*a;
             a++;
             
            if(a>A[cont]){
            
            A[cont]=fatorial;
            B[cont]=A[cont];
            }
     
            }
         for(cont=0; cont<A.length; cont++){
         
         
         System.out.printf("O FACTORIAL DE A COM INDICE %d É: %d\n",cont,B[cont]);
         }
           
        }        
            
    }
    

