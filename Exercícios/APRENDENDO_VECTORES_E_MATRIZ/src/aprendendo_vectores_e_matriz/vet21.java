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
public class vet21 {
    public static void main(String[]args){
        Scanner escreva = new Scanner(System.in);
        int[] vA = new int[10];
        int[] vB = new int[10];
        int[] vC = new int[10];
        
        for(int cont=0; cont<vA.length; cont++ ){
        
            System.out.printf("DIGITE O VALOR DO vA COM INDICE %d:\n",cont);
            vA[cont]=escreva.nextInt();
            System.out.println(" ");
             System.out.printf("DIGITE O VALOR DO vB COM INDICE %d:\n",cont);
            vB[cont]=escreva.nextInt();
            
            if(vA[cont]>vB[cont]){
            
                  vC[cont]=1;
            }
            
           else if(vA[cont]==vB[cont]){
                  vC[cont]=0;
            }
            
           else{
           
                   vC[cont]=-1;
           }
        }
        
        for(int cont=0; cont<vA.length; cont++){
        
        
            System.out.printf("O VALOR DO vC NO INDICE %d É: %d \n",cont,vC[cont]);
        
        }
    
       
    }
    
}
