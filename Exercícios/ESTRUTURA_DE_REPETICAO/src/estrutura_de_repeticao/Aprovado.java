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
public class Aprovado {
    public static void main(String[]args){
    
     Scanner escreva = new Scanner(System.in);
     String disciplina;
     float nota;
     
        System.out.println("DIGITE A DISCIPLINA:");
        disciplina = escreva.nextLine();
        System.out.println("DIGITE A NOTA:");
        nota = escreva.nextInt();
     
     while(nota!=0){
         
         if(nota >= 7){
         
             System.out.println("O ALUNO PASSOU\n");
         }
       
         else{
         
             System.out.println("O ALUNO REPROVOU\n");
         }
         
        System.out.println("DIGITE A DISCIPLINA:");
        disciplina = escreva.nextLine();
        
        System.out.println("DIGITE A NOTA:");
        nota = escreva.nextInt();
         
     }
     
    }
    
}
