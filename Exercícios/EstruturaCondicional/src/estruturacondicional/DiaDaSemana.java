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
public class DiaDaSemana {
    public static void main(String[]args){
        Scanner escreva = new Scanner(System.in);
        String dia;
        int numero;
        
        System.out.println("DIGITE UM DIA DA SEMANA:\n");
        numero = escreva.nextInt();
        
        switch(numero){
         
            case 1: dia = "DOMIGO"; 
            break;
                
            case 2: dia = "SEGUNDA-FEIRA";
            break;
                
            case 3: dia = "TERÇA-FEIRA";
            break;
                
            case 4: dia = "QUARTA-FEIRA";
            break;
                
            case 5: dia ="QUINTA-FEIRA";
            break;
            
            case 6: dia= "SEXTA-FEIRA";
            break;
                
            case 7: dia = "SÁBADO";
            break;
                
            default: dia ="ERRO";
        }
        
        System.out.println(dia);
        
    }
    
}
