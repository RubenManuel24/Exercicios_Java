/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pequenodev;

import java.util.Scanner;

/**
 *
 * @author FATIMA30
 */
public class ArtmeticaBasica {
    public static void main(String[]args){
        Scanner escreva = new Scanner(System.in);
     double v1;
     double v2;
     double soma;
     double difere;
     double produto;
     double quociente;
    
      System.out.println("DIGITE O PRIMEIRO VALOR:");
       v1 = escreva.nextDouble();
       
     System.out.println("DIGITE O SEGUNDO VALOR:");
       v2 = escreva.nextDouble();
       
       soma = v1+v2;
       difere = v1-v2;
       produto = v1*v2;
       quociente = v1/v2;
       
      System.out.printf("A SOMA É: %.2s \n ",soma); 
      System.out.printf("A DIFERENÇA É: %.2s \n ",difere); 
      System.out.printf("O PRODUTO É: %.2s \n ",produto);
      System.out.printf("O QUOCIENTE É: %.2s \n ",quociente); 
      
    }
    
}
