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
public class TipoTriangulo {
    public static void main(String[]args){
    Scanner escreva = new Scanner(System.in);
    int ladoa;
    int ladob;
    int ladoc;
    
   
    System.out.println("DIGITE O PRIMEIRO VALOR:\n");
    ladoa = escreva.nextInt();
    
    System.out.println("DIGITE O SEGUNDO VALOR:\n");
    ladob = escreva.nextInt();
    
    System.out.println("DIGITE O TERCEIRO VALOR:\n");
    ladoc = escreva.nextInt();
    
    
     
    if((ladoc < ladob + ladoa) && (ladob < ladoa + ladoc) && (ladoa < ladob + ladoc) ){
        
        if(ladoa==ladob && ladoa==ladoc){
                System.out.print("O TRIÂNGULO É EQUILÁTERO\n");
                }
        else if ((ladoa==ladob || ladob==ladoc || ladoa==ladoc )){
            System.out.print("O TRIÂNGULO É ISÓSCELES\n");
            
        }
        
        else {
            System.out.println("O TRIÂNGULO É ESCALENO\n");
        }
    
    }
    
    else {
        System.out.println("NÃO PODEM CONSTITUIR UM TRIÂNGULO\n");
    }
    
    
    
    }
    
}
