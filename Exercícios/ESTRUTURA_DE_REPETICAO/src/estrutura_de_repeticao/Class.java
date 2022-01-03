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
public class Class {
    public static void main(String[]args){
    Scanner escreva = new Scanner(System.in);
    int senha;
    
        System.out.println("DIGITE A SENHA:\n");
        senha=escreva.nextInt();
        
        while(senha!=12345){
              System.out.println("SENHA INCORRECTA\n");
             System.out.println("DIGITE A SENHA CORRECTA:\n");
             senha=escreva.nextInt();    
        }
             System.out.println("Senha verdadeira\n");
          
    }
    
}
