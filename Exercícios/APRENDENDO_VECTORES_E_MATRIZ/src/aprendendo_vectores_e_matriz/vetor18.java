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
public class vetor18 {
    public static void main(String[]args){
       Scanner escreva = new Scanner(System.in); 
      int[] veA = new int[10];
    
        for(int cont=0; cont<veA.length; cont++){
     
         System.out.println("DIGIYE OS VALORES: ");
         veA[cont]=escreva.nextInt();
         
        }
        
        for(int cont=0; cont<veA.length; cont++){
            
        if(veA[cont]%2==0){
            System.out.println("OS VALORES DIGITADOS SÃO: "+veA[cont]);
        
        }
        
        else{
            
            break;
        }
        
        }
    }    
    
}
