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
public class Menção {
    public static void main(String[]args){
    Scanner escreva= new Scanner(System.in);
    float nota;
    System.out.println("DIGITE A FAIXA DA SUA NOTA:\n");
    nota = escreva.nextFloat();
    
        if(nota >= 9 && nota <=10){
            System.out.println("MENÇÃO SUPERIOR\n");
        }
        else if(nota >= 7.0 && nota <= 8.9){
             System.out.println("MENÇÃO MÉDIO SUPERIOR\n");        
        }
        else if(nota >= 5.0 && nota <= 6.9){
             System.out.println("MENÇÃO MÉDIO\n");
        }
        else if(nota >= 3.0 && nota <= 4.9){
             System.out.println("MENÇÃO MÉDIO INFERIOR\n");
        }
        else if(nota >= 0.1 && nota <= 2.9){
             System.out.println(" MENÇÃO INFERIOR\n");
        }
        else if(nota > 10){
            System.out.println("MENÇÃO INEXISTENTE\n");
        }
        else{
            System.out.println("MENÇÃO SEM RENDIMENTO");
        }
        
    }
    
}
