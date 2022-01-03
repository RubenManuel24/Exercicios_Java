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
public class Etiqueta {
    public static void main(String[]args){
    Scanner escreva = new Scanner(System.in);
    
    String nome;
    String end;
    String tel;
    
    System.out.println("Digite o nome:");
    nome = escreva.nextLine();
    
    System.out.println("Digite o endereço:");
    end = escreva.nextLine();
    
    System.out.println("Digite o telefone:");
    tel = escreva.nextLine();
    
     System.out.printf("O nome digitado foi: %s \n",nome);
     System.out.printf("O endereço digitado foi: %s \n",end);
     System.out.printf("O telefone digitado foi: %s\n",tel);
    
    
    }
}
