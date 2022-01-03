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
public class Raiz4 {
    public static void main(String[]args){
        Scanner escreva = new Scanner(System.in);
        int opcao;
        double num;
        double raiz;
        
        System.out.println("TEMOS DUAS OPÇÕES:\n1-FIM;\n2-CALCULAR.");
        
        System.out.println("ESCOLHE A OPÇÃO:\n");
        opcao = escreva.nextInt();
        
         while(opcao!=1 && opcao !=2){
             
             System.out.println("DIGITASTE UMA OPÇÃO ERRADA\n");
            
            System.out.println("TEMOS DUAS OPÇÕES:\n1-FIM;\n2-CALCULAR.");
        
           System.out.println("ESCOLHE A OPÇÃO:\n");
           opcao = escreva.nextInt();
            
        }
        
        if(opcao == 1){
               
            System.out.println("FIM\n");
        
        }
        
        else if(opcao == 2){
            
           System.out.println("DIGITE UM NÚMERO PARA CALCULAR A SUA RAIZ:\n");
           num = escreva.nextInt();
           
           if(num>=0){
               
               raiz = Math.sqrt(num);
               
               System.out.printf("A SUA RAIZ É %.2f",raiz);  
           }
           
           else{
           
               System.out.println("ERRO\n");
           
           }
            
        }
        
        else{
        
             System.out.println("OPÇÃO INVÁLIDA\n");
            
        }
        
       
        
    }
    
}
