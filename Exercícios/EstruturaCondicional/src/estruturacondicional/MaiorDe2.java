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
public class MaiorDe2 {
    public static void main(String[]args){
        Scanner escreva = new Scanner(System.in);
        
        int n1;
        int n2;
        System.out.println("DIGITE O PRIMEIRO VALOR:");
        n1 = escreva.nextInt();
        System.out.println("DIGITE O SEGUNDO VALOR:");
        n2 = escreva.nextInt();
        
        if(n1>n2){
            System.out.printf("O NÚMERO >%d< É MAIOR DO NÚMERO >%d<\n",n1,n2);
        }
        else if(n2>n1){ 
            System.out.printf("O NÚMERO >%d< É MAIOR DO NÚMERO >%d<\n",n2,n1);
        }  
        else{
             System.out.printf("O NÚMERO >%d< É IGUAL DO NÚMERO >%d<\n",n1,n2);
        }
    }
    
}
