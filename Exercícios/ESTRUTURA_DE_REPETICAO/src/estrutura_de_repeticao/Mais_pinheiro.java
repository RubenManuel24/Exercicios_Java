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
public class Mais_pinheiro {
        public static void main(String[]args){
        Scanner escreva = new Scanner(System.in);
        
        String car;
       
        
          System.out.println("DIGITE O TIPO DE CARACTER:");
          car = escreva.nextLine();
          
          for(int cont = 1; cont<=10; cont++){
          
              System.out.printf("%s\n%s%s\n%s%s%s\n%s%s%s%s\n%s%s%s%s%s\nd"
                      + "",car,car,car,car,car,car,car,car,car,car,car,car,car,car,car);
          
          }
        
        
        
       }

    
}
