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
public class Exercicio_Vector {
    public static void main(String[]args){
     Scanner escreva = new Scanner(System.in);
      
     int[] vectA = new int[5];
     int[] vectB = new int[5];
        int cont;
     
     for(cont=0; cont<vectA.length; cont++ ){
     
         System.out.println("DIGITE O VALOR DO INDICE: "+cont);
         vectA[cont]= escreva.nextInt();
             
         vectB[cont]=vectA[cont];
     }
      
    for(cont=0; cont<vectB.length; cont++){
    
        System.out.println("O VALOR DO VECTB É: "+ vectB[cont]);
    
    }
      
   }
        
}

