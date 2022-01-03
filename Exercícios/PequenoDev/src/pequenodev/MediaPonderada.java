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

public class MediaPonderada {
    public static void main(String[]args){
    Scanner escreva = new Scanner(System.in);
    
    double v1;
    double v2;
    double v3;
    double media;
    double calculo;
    
   System.out.println("DIGITE O PRIMEIRO VALOR:");
   v1 = escreva.nextDouble();
   
   System.out.println("DIGITE O SEGUNDO VALOR:");
   v2 = escreva.nextDouble();
   
   System.out.println("DIGITE O TERCEIRO VALOR:");
   v3 = escreva.nextDouble();
   
   calculo = (v1*0.01) + (v2*0.02) + (v3*0.03);
   media = calculo/0.06;
   
   System.out.printf("A MEDIA É: %.2f\n",media);
    
    }
    
}













