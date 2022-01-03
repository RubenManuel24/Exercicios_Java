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
public class Inposto {
    public static void main(String[]ags){
        Scanner escreva = new Scanner(System.in);
        double imposto;
        double valor;
        
        System.out.println("DIGITE O VALOR:\n");
        valor = escreva.nextFloat();
        
        if(valor <= 1200){
             System.out.printf("ESTÁS ISENTO DE PAGAR IMPOSTO\n");
        }
        else if(valor >= 1201 && valor <= 2500){
            
            imposto = (valor*0.1);
            System.out.printf("O IMPOSTO A PAGAR É DE: %.1f\n ",imposto);
        }
        else if(valor >= 2501 && valor <= 5000){
            
            imposto =  (valor*0.15);
            System.out.printf("O IMPOSTO A PAGAR É DE: %.1f\n ",imposto);            
        }
        else {
           
            imposto = (valor*0.2);
            System.out.printf("O IMPOSTO A PAGAR É DE: %.1f\n",imposto);
        }
        
    }
    
}

















