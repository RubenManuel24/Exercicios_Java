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
public class vect5 {
    public static void main(String[]args){
    Scanner escreva = new Scanner(System.in);
    int[] vetA = new int[10];
    int[] vetB = new int[10];
    int[] vetC = new int[10];
    
    for(int cont=0; cont<vetA.length; cont++){
    
          System.out.println("DIGITE OS VALORES DO INDICE DO vetA: "+cont);
          vetA[cont]=escreva.nextInt();
          System.out.println(" ");
          System.out.println("DIGITE OS VALORES DO INDICE DO vetB: "+cont);
          vetB[cont]=escreva.nextInt();
          
          vetC[cont]=vetA[cont]-vetB[cont];
    }
    
    
    for(int cont=0; cont<vetC.length; cont++){
    
        System.out.println("O VALOR DO vetC É: "+vetC[cont]);
    }
    }
    
}
