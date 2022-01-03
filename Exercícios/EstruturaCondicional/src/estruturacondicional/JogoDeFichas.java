/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturacondicional;

import java.util.Scanner;

/**
 *
 * @author FATIMA30
 */
public class JogoDeFichas {
    private static Object corl;
    public static void main(String[]args){
      Scanner escreva = new Scanner(System.in);
      String cor1;
      String cor2;
      double roteio;
      
        System.out.println("RETIRA A PRIMEIRA FICHA:\n");
        cor1 = escreva.nextLine();
        System.out.println("RETIRA A SEGUNDA FICHA:\n");
        cor2 = escreva.nextLine();
        
        if(cor1.equals("BRANCA") && cor2.equals("BRANCA")){
            
            roteio = 0;
            System.out.printf("O SEU ROTEIO É DE: %.0f\n",roteio);
        }
        else if(cor1.equals("BRANCA") && cor2.equals("PRETA")){
           
            roteio = 1/2;
            System.out.printf("O SEU ROTEIO É DE: %.0f\n",roteio);
        }
        else if(cor1.equals("PRETA") && cor2.equals("BRANCA")){
            
            roteio = 1;
            System.out.printf("O SEU ROTEIO É DE: %.0f\n ",roteio);
        }
        else if(cor1.equals("PRETA") && cor2.equals("PRETA0")){
            
            roteio = 2;
            System.out.printf("O SEU ROTEIO É DE: %.0f\n ",roteio);
        }
        
        else{
            
            System.out.println("COR NÃO EXISTENTE\n");
                    
        }
    }
    
}
