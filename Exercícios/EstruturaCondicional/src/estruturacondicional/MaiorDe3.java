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
public class MaiorDe3 {
    public static void main(String[]args){
        Scanner escreva = new Scanner(System.in);
        int n1;
        int n2;
        int n3;
        System.out.println("DIGITE O PRIMEIRO NÚMERO:\n");
        n1 = escreva.nextInt();
        System.out.println("DIGITE O SEGUNDO NÚMERO:\n");
        n2 = escreva.nextInt();
        System.out.println("DIGITE TERCEIRO NÚMERO:\n");
        n3 = escreva.nextInt();
        
        if(n1>n2 && n1>n3){
               System.out.printf("O %d É MAIOR\n",n1);
        }
        else if(n2>n1 && n2>n3){
              System.out.printf("O %d É MAIOR\n",n2);
        }
        else {
            
            System.out.printf("O %d É MAIOR\n",n3);
        }
    }
    
}
