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
public class AnoBissexto {
    public static void main(String[]args){
    Scanner escreva = new Scanner(System.in);
    int ano;
    System.out.println("DIGITE O ANO:\n");
    ano = escreva.nextInt();
    
    if(ano%4==0){
        
        System.out.printf("O ANO DE %d É BISSEXTO\n",ano);
    }
    else{
        
        System.out.printf("O ANO DE %d NÃO É BISSEXTO\n",ano);
    
    }
    
    
    
    }
    
}
