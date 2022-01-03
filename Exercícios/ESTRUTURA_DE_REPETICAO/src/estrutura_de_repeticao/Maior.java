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
public class Maior {
    public static void main(String[]args){
      Scanner escreva = new Scanner(System.in);
      
      int a;
      int cont;
      
      cont=0;
      
      System.out.println("DIGITE O NUMERO:\n");
      a = escreva.nextInt();
      
      while(cont<a){
      cont++;
          System.out.println("CONTAGEM"+cont);
        
      }
    
    }
} 