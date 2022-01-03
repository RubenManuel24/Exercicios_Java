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
public class Vector9 {
    public static void main(String[]args){
    Scanner escreva= new Scanner(System.in);
    int soma=0;
    int[] vetA = new int[10];
    
    for(int cont=0; cont<vetA.length; cont++){
    
        System.out.println("DIGITA OS VALORES: ");
        vetA[cont]= escreva.nextInt();
        
        }
    for(int cont=0; cont<vetA.length; cont++){
    
      if(vetA[cont]%2==0){
            
            System.out.println("O VALOR PAR É: "+vetA[cont]);
            soma=soma+1;           
        }
           
    }
       System.out.println("A QUANTIDADE DE ELEMENTOS PARES É DE: "+soma);
    
    
    }
    
}
