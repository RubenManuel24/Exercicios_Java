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
public class vector4 {
    public static void main(String[]args){
    Scanner escreva = new Scanner(System.in);
    
    int[] vetA = new int[15];
    int[] vetB = new int[15];
        int cont;
    
    for(cont=0; cont<vetA.length; cont++){
    
        System.out.println("DIGITE O VALOR DO INDICE: "+cont);
        vetA[cont]= escreva.nextInt();
    
        vetB[cont]=(int) Math.sqrt(vetA[cont]);
    }
    
    for(cont=0; cont<vetB.length; cont++){
    
        System.out.println("OS VALORES DO VETB SÃO: "+vetB[cont]);
        
    }
      
    }
    
}
