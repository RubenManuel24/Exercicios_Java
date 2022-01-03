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
public class ConversãoTemperatura {
    public static void main(String[]args){
        Scanner escreva = new Scanner(System.in);
        String contin = "A";
        
        for(int cont = 0; cont<=100;cont++){
           System.out.printf("%dº GRAUS CELCIOS\n",cont);
           
           System.out.println("DIGITE A PARA CONTINUAR:\n");
           contin = escreva.nextLine(); 
                    
        }       
    }
}
