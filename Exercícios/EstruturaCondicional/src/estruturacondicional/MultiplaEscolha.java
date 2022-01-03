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
public class MultiplaEscolha {
    public static void main(String[]args){
    Scanner escreva = new Scanner(System.in);
    int numero;
    String res;
    
    System.out.println(">>QUESTÕES SOBRE PROGRAMAÇÃO<<\n\n");
    System.out.println("1. O HTML É UMA LINGUAGEM DE PROGRAMAÇÃO.\n\n2. JAVA É UNA LINGUAGEM DE PROGRAMAÇÃO.\n\n3. A LINGUAGEM PHP É MAIS USADA NA WEB EM RELAÇÃO O JAVA.\n\n4. BACK-END É A PROGRAMAÇÃO DE CÓDIGO FORA DO ALCANCE DOS OLHOS DO UTILISADOR FINAL.\n\n");
    System.out.println("DIGITE A QUESTÃO ERRADA:");
    numero = escreva.nextInt();
    
        switch(numero){
            case 1: System.out.println("CERTO");
            break; 
               
            case 2: System.out.println("ERRADO");
            break;
                
            case 3: System.out.println("ERRADO");
            break;
                
            case 4:System.out.println("ERRADO");
            break;
       
            default: System.out.println("ESSA OPÇÃO NÃO EXISTE");
       }
    }
}
