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
public class vector8 {
    public static void main(String[]agrs){
        Scanner escreva= new Scanner(System.in);
        
    int[] vetA = new int[10];
    int[] vetB = new int[10];
    
    for(int cont=0; cont<vetA.length; cont++){
    
        System.out.println("DIGITE OS VALORES DO INDICE vetA: "+cont);
        vetA[cont]=escreva.nextInt();
        
        vetB[cont]=vetA[cont]%2;
    }
    
    
    for(int cont=0; cont<vetB.length; cont++){
        
        System.out.println("O34"
                + " VALOR DA vetB É: "+vetB[cont]);
    
    }
    }
}
