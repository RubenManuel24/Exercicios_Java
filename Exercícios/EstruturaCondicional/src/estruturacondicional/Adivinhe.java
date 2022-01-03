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
public class Adivinhe {
    public static void main(String[]args){
      Scanner escreva = new Scanner(System.in);
      int adivinha; 
      double ro;
      double a;
      int arend;
      System.out.println("DIGITE O TEU PALPITE DE 1 A 10:\n");
      adivinha = escreva.nextInt();
     
      ro = Math.random();
      a = (1+ro*(11-1));
      arend = (int) Math.round(a);
      
      System.out.println("O SORTEIO É:\n"+arend);
      
      if(adivinha == arend){
          System.out.println(">>ACERTASTE O PALPITE<<\n"); 
          System.out.println("DIGITE NOVAMENTE:\n");
      }
      else{
          
          System.out.println(">>ERRASTE O PALPITE<<\n");
      }
    }
    
    
}
