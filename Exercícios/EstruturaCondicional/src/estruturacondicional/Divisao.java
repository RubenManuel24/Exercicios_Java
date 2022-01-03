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
public class Divisao {
    public static void main(String[]args){
        Scanner escreva = new Scanner(System.in);
        float n1;
        float n2;
        float div;
        System.out.println("DIGITE O PRIMEIRO VALOR:");
        n1 = escreva.nextFloat();
        System.out.println("DIGITE O SEGUNDO VALOR:");
        n2 = escreva.nextFloat();
        
        div = (n1/n2);
        
        if (n2!=0){
            
            System.out.printf("A DIVISÃO DE %.1f E %.1f É IGUAL A:\n %.1f  \n",n1,n2,div);
        }
        else {
            System.out.println("ERRO");
        }
        
   }
    
}
