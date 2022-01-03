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
public class ControleDeTela {
    public static void main(String[]args){
     Scanner escreva = new Scanner(System.in);
     String a;
     String b;
     String c;
     
     System.out.println("Digite a primeira expressão: ");
     a = escreva.nextLine();
     
     System.out.println("Digite a segunda expressão: ");
     b = escreva.nextLine();
     
     System.out.println("Digite a terceira expressão: ");
     c = escreva.nextLine();
     
     System.out.printf("..........\n.        .\n.       . \n.%s      .\n.        .\n.        .\n..........\n",a);
     System.out.printf("..........\n.        .\n.       . \n.%s      .\n.        .\n.        .\n..........\n",b);
     System.out.printf("..........\n.        .\n.       . \n.%s      .\n.        .\n.        .\n..........\n",c);
     
     
     
     
   }
} 
    
    

