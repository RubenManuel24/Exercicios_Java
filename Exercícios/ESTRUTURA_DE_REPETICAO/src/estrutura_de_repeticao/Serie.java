/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estrutura_de_repeticao;

import java.util.Scanner;

/**
 *
 * @author FATIMA30
 */
public class Serie {
    public static void main(String[]args){
    Scanner escreva = new Scanner(System.in);
    int N;
    int S;
    
        System.out.println("DIGITA O VALOR DO N:\n");
        N = escreva.nextInt();
        
        S = (1/N)+(2/N-1)+(3/N-2)+(4/N-3);
   
        while(N != 0){
            
        System.out.println("O VALOR DE S É: \n"+S);
         
        System.out.println("DIGITA O VALOR DO N:\n");
        N = escreva.nextInt();
        
        }
    
    
    
    }
    
}
