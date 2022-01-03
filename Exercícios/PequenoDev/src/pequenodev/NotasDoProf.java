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
public class NotasDoProf {
    public static void main(String[]args){
         Scanner escreva = new Scanner(System.in);
        double n1;
        double n2;
        double np;
        double media;
        double mediaf;
        String nome;
        
         System.out.println("DIGITE NOME DO ALUNO:");
         nome = escreva.nextLine();
         
        System.out.println("DIGITE A NOTA DO PRIMEIRO EXERCÍCIO:");
        n1 = escreva.nextDouble();
        
        System.out.println("DIGITE A NOTA DO SEGUNDO EXERCÍCIO:");
        n2 = escreva.nextDouble();
        
        System.out.println("DIGITE A NOTA DA PROVA:");
        np = escreva.nextDouble();
        
        media = (n1*1 + n2*2)/3;
        mediaf = (media*2 + np*8)/10;
        
        System.out.printf("A NOTA FINAL DO %s ESTUDANTE É: %.1f v \n",nome,mediaf);
        
                
    
    
    }
    
}
