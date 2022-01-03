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
public class Numero2 {
    public static void main(String[]args){
    Scanner escreva = new Scanner(System.in);
    int a;
    int cont;
    
        System.out.println("DIGITA O PRIMEIRO NÚMERO:");
        cont = escreva.nextInt();
        
        System.out.println("DIGITE O SEGUNDO NÚMERO:");
        a = escreva.nextInt();
        
        
        while(cont <= a){
        
            cont++;
            System.out.printf("OS NUMEROS SÃO: %d\n",cont);
        
        }
       
        
    }
    
}
