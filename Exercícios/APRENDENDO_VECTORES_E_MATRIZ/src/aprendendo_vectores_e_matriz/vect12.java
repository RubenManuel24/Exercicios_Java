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
public class vect12 {
    public static void main(String[]args){
       Scanner escreva= new Scanner(System.in);
       int vetA[] = new int[10];
       int media;
       int soma=0;
       int b=0;
        
        for(int cont=0; cont<vetA.length; cont++){
            System.out.println("DIGITE O VALOR DO INDICE >> "+cont);
            vetA[cont]=escreva.nextInt();
        
            if (vetA[cont]%2==1){
            
                 b=b+1;
                 
                 soma=soma+vetA[cont];
            
            }
             
        }
          
          media=soma/b;
          System.out.println("A MEDIA DOS VALORES IMPARES É: "+media);
    
    }
    
}
