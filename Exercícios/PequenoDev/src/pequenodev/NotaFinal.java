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
public class NotaFinal {
    public static void main(String[]args){
    Scanner escreva = new Scanner(System.in);
    double n1;
    double n2;
    double peso1;
    double peso2;
    double notaS;
    
    
    System.out.println("DIGITE A NOTA DO PRIMEIRO BIMESTRE:");
    n1 = escreva.nextDouble();
    
    
    System.out.println("DIGITE A NOTA DO SEGUNDO BIMESTRE:");
    n2 = escreva.nextDouble();
    
    peso1 = n1*0.2;
    peso2 = n2*0.3;
    
    notaS = peso1 + peso2;
    
    System.out.printf("A NOTA DO SEMESTRE É: %.2s",notaS);
    
    }
    
}
