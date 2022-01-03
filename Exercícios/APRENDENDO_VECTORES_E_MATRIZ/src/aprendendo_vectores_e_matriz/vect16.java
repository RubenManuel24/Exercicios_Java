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
public class vect16 {
    public static void main(String[]args){
    Scanner escreva= new Scanner(System.in);
     int[] vetA = new int[10];
     int soma=0;
     int quantidade=0;
     int giro=0;
     double media;
     int soma2=0;
     for(int cont=0; cont<vetA.length; cont++){
     
         System.out.println("DIGITE O VALOR DO INDICE >> "+cont);
         vetA[cont]=escreva.nextInt();
         
         if(vetA[cont]<15){
         
                  soma += vetA[cont];
                  
         }
         else if(vetA[cont]==15){
              
             quantidade += 1;
         
         }
         else if(vetA[cont]>15){
         
             giro += 1;
             
             soma2 += vetA[cont];
             
         
         }
     
     
     }
            media=soma2/giro;
            
        System.out.println("AS SOMAS DE ELEMENTOS ARMAZENADOS NESTE VETOR INFERIORES A 15 É: " +soma+ "\nA QUANTIDADE DE ELEMENTOS ARMAZENADOS NO VEOTR QUE SÃO IGUAIS A 15 É: " +quantidade+ "\n A MEDIA DOS ELEMENTOS ARMAZENADOS NO VETOR QUE SÃO SUPERIORES A 15 É: "+media);
    }
    
}
