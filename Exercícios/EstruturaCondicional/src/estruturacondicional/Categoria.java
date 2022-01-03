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
public class Categoria {
    public static void main(String[]args){
       Scanner escreva = new Scanner(System.in);
       Double altura;
       System.out.println("DIGITE A TUA ALTURA:\n");
       altura = escreva.nextDouble();
       
       if(altura < 1.60){
           System.out.println("\"ÉS BAIXINHO\"\n");
       }
       else if(altura >= 1.60 && altura <= 1.85){
          System.out.println("\"TENS UMA ALTURA NORMAL\"\n");
       }
       else {
           System.out.println("\"FAZ FRIO AÍ EM CIMA?\"\n");
       }
    }
    
}
