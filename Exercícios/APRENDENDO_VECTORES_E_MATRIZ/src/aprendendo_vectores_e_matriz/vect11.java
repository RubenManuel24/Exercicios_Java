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
public class vect11 {
    public static void main(String[]args){
    Scanner escreva = new Scanner(System.in);
    int[] vetA = new int[10];
    int soma=0;
    for(int cont=0; cont<vetA.length; cont++){
    
        System.out.println("DIGITE OS VALORES DO INDICE >>> "+cont);
        vetA[cont]= escreva.nextInt();
        
        if(vetA[cont]%5==0){
        
               soma=soma+vetA[cont];
        }
    }
    
        System.out.println("A SOMA DOS VALORES MULTIPLOS POR 5 É: "+soma);
    
    }
}
