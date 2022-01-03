/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pequenodev;

/**
 *
 * @author FATIMA30
 */import java.util.Scanner;

public class MediaArtmetica {
    public static void main(String[]args){
    Scanner escreva = new Scanner(System.in);
    
    double n1;
    double n2;
    double n3;
    double media;
    
    System.out.println("DIGITE A PRIMEIRA NOTA:");
    n1 = escreva.nextDouble();
    
    System.out.println("DIGITE A PRIMEIRA NOTA:");
    n2 = escreva.nextDouble();
    
    System.out.println("DIGITE A PRIMEIRA NOTA:");
    n3 = escreva.nextDouble();
    
    
    media = (n1+n2+n3)/3;
    System.out.printf("A MÉDIA DO ESTUDANTE É: %.2f \n",media);
    
    
    }
    
}
