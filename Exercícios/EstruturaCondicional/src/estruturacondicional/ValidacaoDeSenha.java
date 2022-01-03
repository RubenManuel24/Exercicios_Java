/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturacondicional;

import java.util.Scanner;

/**
 *
 * @author FATIMA30
 */
public class ValidacaoDeSenha {
    public static void main(String[]args){
       Scanner escreva = new Scanner(System.in);
       String senha;
       String senhaP;
       System.out.println("DIGITE A TUA SENHA:\n");
       senha = escreva.nextLine();
       
       senhaP = "123456RB";
       
       if(senha.equals(senhaP)){
          System.out.println("ACESSO AUTORIZADO\n");
       }
       else{
          System.out.println("ACESSO NEGADO\n");
       }
    
    }
    
}
