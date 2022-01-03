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
public class SomaIdade {
    public static void main (String[]args){
    Scanner escreva = new Scanner(System.in);
    int id;
    int soma;
    
    System.out.println("DIGITE A IDADE:");
    id = escreva.nextInt();
    
    soma = id*(id+1)/2;
    
    System.out.printf("A SOMA DE TODAS AS IDADE É: %d\n",soma);
    
    }
    
}
