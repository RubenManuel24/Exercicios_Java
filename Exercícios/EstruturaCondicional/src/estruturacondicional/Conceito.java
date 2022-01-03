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
public class Conceito {
    public static void main(String[]args){
        Scanner escreva = new Scanner(System.in);
        int nota;
        System.out.println("DIGITE O NOTA:\n"); 
        nota = escreva.nextInt();
        
        if(nota >=90 && nota <=100){
                 System.out.println(" CONCEITO \"A\" \n");
        }
        else if(nota >=75 && nota <=89){ 
                 System.out.println(" CONCEITO \"B\" \n");
        }
        else if(nota >=50 && nota <=74){
                  System.out.println(" CONCEITO \"C\" \n"); 
        }
        else if(nota >=40 && nota <=49){
                   System.out.println(" CONCEITO \"D\" \n");
        }
        else if(nota >=0 && nota <=39){
                   System.out.println(" CONCEITO \"E\" \n");
        }
        else{
                    System.out.println("NOTA ERRADA\n");
        }
    }
    
}
