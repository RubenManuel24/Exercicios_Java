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
public class Estatistica {
    public static void main(String[]args){
        Scanner escreva = new Scanner(System.in);
        double nota;
        double cont = 0;
        double soma = 0;
        double media;
        float a = 0;
        
             
        while(cont <= 4){
            
            
            System.out.println("DIGITE A NOTA:\n");
            nota = escreva.nextFloat();
            
          
            
            
            if(nota >= 0 && nota <= 10 ){
             
            soma = soma + nota;
            
               
            }
            
            else{
                   System.out.println("NOTA NÃO EXISTENTE\n");
                 
            }
              
            cont++; 
        }
    
          media =(soma/cont);
              
           System.out.printf("FORAM DIGITADAS %d NOTAS\n",cont);
           System.out.printf("A MEDIA FOI: %1.f",media);
    
    }
    
}
