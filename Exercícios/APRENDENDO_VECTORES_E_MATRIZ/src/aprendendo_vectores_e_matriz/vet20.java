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
public class vet20 {
    public static void main(String[]args){
    Scanner escreva = new Scanner(System.in);
    int[] vA = new int[10];
    int[] vB = new int[10];
    
        System.out.println("DIGITE OS VALORES DO VA:  ");
    for(int cont=0; cont<vA.length; cont++){
      vA[cont]=escreva.nextInt();
      
      if(vA[cont]%2==0){
          
          vB[cont]=1;
      }
      else{
          
           vB[cont]=0;
      }
         
    }
        for(int cont=0; cont<vA.length; cont++){
        
            System.out.println("O VALOR DO vB DO INDICE >>"+cont+ "\n"+vB[cont]  );
        
        }
    }
    
}
