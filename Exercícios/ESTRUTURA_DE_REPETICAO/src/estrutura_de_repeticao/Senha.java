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
public class Senha {
    public static void main(String[]args){
    Scanner escreva = new Scanner(System.in);
    
     final String senhaC;
     senhaC = "RUBEN";
     String senhaT;
     
     
     
        System.out.println("DIGITE A SENHA:\n");
        senhaT = escreva.nextLine();
     
        if(senhaT.equals(senhaC)){
           
        System.out.println("O USUÁRIO ESTÁ CORRECTO\n");
     
        }
        
        else{
                for(int cont=1; cont<=2;cont++){
                    
                  System.out.println("SENHA ESTÁ INCORRECTA\n");
                 
                  System.out.println("DIGITE A SENHA CORRECTA:\n");
                  senhaT = escreva.nextLine();
                  
                  
                  if(senhaT.equals(senhaC)){
                  
                  System.out.println("O USUÁRIO ESTÁ CORRECTO\n");
                  break;
                  }
                  
                
                        
                }
        } 
    }
}   
