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
public class vect23 {
    public static void main(String[]args){
    Scanner escreva = new Scanner(System.in);
    int[] A = new int[20];
    int[] B = new int[20];
    int[] C = new int[20];
    
    for(int cont=0; cont<A.length; cont++){
     
        System.out.println("DIGITE OS VALORES DE A: ");
        A[cont]=escreva.nextInt();
        
        if(A[cont]%2==0){
        
               B[cont]=A[cont];
        }
        else{
        
              C[cont]=A[cont];
        }
        
        
    }
    for(int cont=0; cont<A.length;cont++){
             
            System.out.println("O VALOR DO B É: "+B[cont]);
        
        }
    for(int cont=0; cont<A.length;cont++){
             
            System.out.println("O VALOR DO C É: "+C[cont]);
        
        }
    
    }
    
}
