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
public class TudoJunto {
    public static void main(String[]args){
        Scanner escreva = new Scanner(System.in);
     int op;
     String car = "*";
     
     
        System.out.println("MENU:0.\n1.\n2.\n3.\n4.\n");
        System.out.println("DIGITE A OPÇÃO:\n");
        op = escreva.nextInt();
        
        for(int cont = 1; cont<=10; cont++){
            
            
            switch(op){
            
            case 0: 
            break;
                
            case 1: System.out.printf("%s%s\n%s%s%s%s\n%s%s%s%s%s%s\n%s%s%s%s%s%s%s%s\n",car,car,car,car,car,car,car,car,car,car,car,car,car,car,car,car,car,car,car,car);
            break;
                
            case 2: System.out.printf("%s\n%s%s\n%s%s%s\n%s%s%s%s\n%s%s%s%s%s\n",car,car,car,car,car,car,car,car,car,car,car,car,car,car,car);
            break;
            
            case 3: System.out.printf("%s%s%s%s%s%s%s%s\n%s%s%s%s%s%s\n%s%s%s%s\n%s%s\n",car,car,car,car,car,car,car,car,car,car,car,car,car,car,car,car,car,car,car,car);
            break;
                
            case 4:  System.out.printf("%s%s%s%s%s%\n%s%s%s%s\n\n%s%s%s\n%s%s\n%s\n",car,car,car,car,car,car,car,car,car,car,car,car,car,car,car);
            break;
                
           default: System.out.println("OPÇÃO INVALIDA\n");
            
            }
             
        
        }
        
        
        
    
            
    }
    
    
}
