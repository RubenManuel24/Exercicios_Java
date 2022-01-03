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
public class EsCondicionalComposta {
    public static void main(String[]args){
        Scanner escreva = new Scanner(System.in);
        int nasc;
        int id;
        
        System.out.println("DIGITE O ANO DE NASCIMENTO:");
        nasc = escreva.nextInt();
        
        id = 2021 - nasc;
        
        System.out.printf("A IDADE DA PESSOA É DE %d ANOS\n",id);
        
        if(id >=18){
            System.out.println("A PESSOA É MAIOR DE IDADE");
        }
        
        else {
            System.out.println("A PESSOA É MENOR DE IDADE");
        }
    }
    
}

















