/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pequenodev;

/**
 *
 * @author FATIMA30
 */
import java.util.Scanner;
public class EntradadDeDados {
    public static void main(String[]args){
    Scanner escreva = new Scanner(System.in);
    
    
   System.out.println("DIGITE O NOME:");
   String  nome = escreva.nextLine();
   
   System.out.println("DIGITE A NOTA:");
   int nota = escreva.nextInt();
   
    System.out.println("A NOTA DO " + nome + " É " +nota);
}
}