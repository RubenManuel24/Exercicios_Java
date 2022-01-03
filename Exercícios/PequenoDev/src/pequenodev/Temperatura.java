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
public class Temperatura {
    public static void main(String[]args){
    Scanner escreva = new Scanner(System.in);
      double f;
      double c;
      
      System.out.println("DIGITE A TEM PERATURA EM FAHRENEIT:");
      f = escreva.nextDouble();
      
      c = (9/5)*(f - 32);
      System.out.printf("A TEMPERATURA EM CELSIUS É: %.1f \n",c);
        
    }
    
}
