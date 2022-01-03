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
public class Vect18 {
    public static void main(String[]args){
       Scanner escreva = new Scanner(System.in);
       
      double[] notaA = new double[10];
      double[] notaB = new double[10];
      double[] media = new double[10];
      
      for(int cont=0; cont<notaA.length; cont++){
      
        System.out.println("DIGITE A PRIMEIRA NOTA DO ALUNO >> "+cont);
        notaA[cont] = escreva.nextDouble();
        
          System.out.println("DIGITE A SEGUNDA NOTA DO ALUNO >> "+cont);
          notaB[cont] = escreva.nextDouble();
          
          media[cont]=(notaA[cont]+notaB[cont])/2;
      
      
      }
      
      for(int cont=0; cont<notaA.length; cont++){
      
        if(media[cont]>=7){
        
              System.out.printf("O ALUNO %d ESTÁ APROVADO COM A MÉDIA: %.1f\n",cont,media[cont]);
        }
        
        else{
        
            System.out.printf("O ALUNO %d ESTÁ REPROVADO COM A MÉDIA: %.1f\n",cont,media[cont]);
        }
      
      }
    }
    
}
