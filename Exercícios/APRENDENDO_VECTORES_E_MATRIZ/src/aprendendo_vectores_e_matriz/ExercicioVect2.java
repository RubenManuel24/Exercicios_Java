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
public class ExercicioVect2 {
    public static void main(String[]args){
        Scanner escreva = new Scanner(System.in);
        
      int[] vetA = new int[8];
      int[] vetB = new int[8];
        int cont;
      
      for(cont=0; cont<vetA.length; cont++){
      
          System.out.println("DIGITE VALOR NA POSIÇÃO: "+ cont);
          
          vetA[cont]= escreva.nextInt();
          
          vetB[cont]=vetA[cont]*2;
      
      }
       
      
      for(cont=0; cont<vetB.length; cont++){
      
          System.out.println("O VALOR DO VETB É: "+ vetB[cont]);
      
      }
    }
}
