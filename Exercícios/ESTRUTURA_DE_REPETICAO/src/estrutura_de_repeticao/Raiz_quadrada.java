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
public class Raiz_quadrada {
    public static void main(String[]args){
    Scanner escreva = new Scanner(System.in);
    double num;
    double calcular;
    
        System.out.println("DIGITA UM VALOR PARA CALCULAR A SUA RAIZ:\n");
        num = escreva.nextInt();
        calcular = Math.sqrt(num);
        
        System.out.printf("A RAIZ QUADRADA DO NUMERO %.1f É :%.1f\n",num,calcular);
        while(num >= 0){
            
                 System.out.println("DIGITA UM VALOR PARA CALCULAR A SUA RAIZ:\n");
                 num = escreva.nextInt();
                 calcular = Math.sqrt(num);
        
                 System.out.printf("A RAIZ QUADRADA DO NUMERO %.1f É :%.1f\n",num,calcular);
            }
                
                 System.out.println("ERRO\n");
                
        
       
        }
    
    }
    
    

