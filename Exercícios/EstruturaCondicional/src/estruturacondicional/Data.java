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
public class Data {
    public static void main(String[]args){
       Scanner escreva = new Scanner(System.in);
       
      String traco1;
      String traco2;
      int dia;
      int mes;
      int ano;
      System.out.println("DIGITE A DATA DO FORMATO DD/MM/AAAA:\n");
      dia = escreva.nextInt();
      traco1 = escreva.nextLine();
      mes = escreva.nextInt();
      traco2 = escreva.nextLine();
      ano = escreva.nextInt();
      
        if((mes >= 1 && mes <=12)&&((dia >= 1 && dia <= 31) && (traco1.equals("/") && traco2.equals("/")))){
            
            System.out.printf("A DATA DIGITADA É: %d/%d/%d\n",dia,mes,ano);
            
        }
        else{
            
            System.out.println("ERRO");
        }
    }
                 
}
