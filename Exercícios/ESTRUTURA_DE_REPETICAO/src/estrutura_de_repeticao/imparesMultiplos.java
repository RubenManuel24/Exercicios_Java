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
public class imparesMultiplos {
    public static void main(String[]args){
        Scanner escreva = new Scanner(System.in);
         int cont;
         int a;
         int soma = 1;
        System.out.println("DIGITA O PRIMEIRO VALOR:\n");
        cont = escreva.nextInt();
        
        System.out.println("DIGITE O SEGUNDO VALOR:\n");
         a = escreva.nextInt();
         
         while(cont >= a){
         
         if(cont%2==1 && cont%3==0){
             
             soma = soma + cont;
             
            }
         
         cont--;
         
       }
        System.out.println("O RESULTADO É: "+soma);
    }
    
}
