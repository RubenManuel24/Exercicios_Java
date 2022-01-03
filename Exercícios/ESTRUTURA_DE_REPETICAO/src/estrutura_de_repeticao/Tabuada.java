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
public class Tabuada {
    public static void main(String[]args){
        Scanner escreva = new Scanner(System.in);
    int num;
    int calculo;
    int resp;
    
    
       System.out.println("QUER CONTINUAR?\n");
       resp = escreva.nextLine();
            
       while(resp == null ? ("S") == null : resp.equals("S")){
      
       
       
             System.out.println("DIGITE O VALOR:\n");
            num = escreva.nextInt();
            
        if(num >= 1 && num <=9){
            
            for(int cont = 1; cont <= 10; cont++){
                calculo = num*cont;
                System.out.printf("A TABUADA DE %d É: %dX%d=%d \n",num,num,cont,calculo);   
            }  
        }
        
        else{
        
               System.out.println("ERRRO\n");
        }
        
         
        }
       
       
       
      
        
   }   
}
        
      