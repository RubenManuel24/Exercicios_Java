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
public class VECTOR5 {
    public static void main(String[]args){
        Scanner escreva = new Scanner(System.in);
    
    int[] vetA = new int[10];
    int[] vetB = new int[vetA.length];
    
    for(int cont=0; cont<vetA.length; cont++){
        
        System.out.println("DIGITA O VALOR DO INDICE: "+cont);
        vetA[cont]= escreva.nextInt();
        vetB[cont]=vetA[cont]*cont;
    }
    
    for(int cont=0; cont<vetB.length; cont++){
    
        System.out.println("O VALOR DO VET É: "+vetB[cont]);
        
    }
    }
    
}
