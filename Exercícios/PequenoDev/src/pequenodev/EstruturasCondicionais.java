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
public class EstruturasCondicionais {
    public static void main(String[]args){
        Scanner escreva = new Scanner(System.in);
        int n1;
        int n2;
        int m;
        
        System.out.println("DIGITE A PRIMEIRA NOTA:");
        n1 = escreva.nextInt();
        
         System.out.println("DIGITE A SEGUNDA NOTA:");
        n2 = escreva.nextInt();
        
        m = (n1 + n2)/2;
        System.out.printf("A MÉDIA É: %d \n",m);
        
        if (m>9){
            System.out.println("PARABENS");
        } 
    
    }
    
}
