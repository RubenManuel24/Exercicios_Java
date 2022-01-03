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
public class Vect17 {
    public static void main(String[]args){
    Scanner escreva = new Scanner(System.in);
    int[] vetA = new int[10];
    int giro=0;
    for(int cont=0; cont<vetA.length; cont++){
        
        System.out.println("DIGITE A IDADES DA PESSAO NA POSIÇÃO >> "+cont);
        vetA[cont]=escreva.nextInt();
        
       if(vetA[cont]>35){
       
           giro=giro+1;
       }
     }
       
       for(int cont=0; cont<vetA.length;cont++){
           
           if(vetA[cont]>35){
       
           System.out.println("IDADE MAIOR DE 35 ANOS: "+vetA[cont]);
           }
       }
       
        System.out.println("A QUANTIDADE DE PESSOA QUE POSSUEM MAIOR DE 35 É DE: "+giro);
   
         
        
    }
    
}
