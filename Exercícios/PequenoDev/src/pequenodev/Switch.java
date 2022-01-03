/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pequenodev;

import java.util.Scanner;

/**
 *
 * @author FATIMA30
 */
public class Switch {
    public static void main(String[]args){
    Scanner escreva = new Scanner(System.in);
    String modalidade;
   int quantos;
    System.out.println("QUANTOS JOGADORES NO CAMPO:");
    quantos = escreva.nextInt();
    
    switch(quantos){
    
        case 11: modalidade = "FUTEBOL";
        break;
        case 5: modalidade = "BASKEBOLL";
        break;
        case 1: modalidade = "TENIZ";
        break;
        default: modalidade = "ERRO"; 
    }
        System.out.printf("A MODALIDADE COM ESTÁ QUANTIDADE DE JOGADOR NUMA EQUIPE É:\n>>%s<<\n",modalidade);
            
   
            
    
    
    
    
    
    }
}
