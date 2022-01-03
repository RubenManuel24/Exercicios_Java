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
public class EquacaoDoSegundoII {
    public static void main(String[]args){
        Scanner escreva = new Scanner(System.in);
        
     float a;
     float b;
     float c;
     float ex;
     float x1;
     float x2;
     
     System.out.println(">>>>>PROGRAMA PARA CALCULAR EQUAÇÃO DO II GRAU<<<<");
     
     System.out.println("DIGITE O VALOR DE a:");
     a = escreva.nextFloat();
     
      System.out.println("DIGITE O VALOR DE b:");
     b = escreva.nextFloat();
     
      System.out.println("DIGITE O VALOR DE c:");
     c = escreva.nextFloat();
     
     
     ex = (float) Math.pow(b,2);
     
     x1 = (float) ((-b+Math.sqrt(ex - 4*a*c))/2*a);
     x2 = (float) ((-b-Math.sqrt(ex - 4*a*c))/2*a);
     
     System.out.println("O VALOR DO X1 É: "+x1);
     System.out.println("O VALOR DO X2 É: "+x2);
     
     
     }
    
}
