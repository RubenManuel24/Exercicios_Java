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
public class TipoDePessoa {
    public static void main(String[]args){
        Scanner escreva = new Scanner(System.in);
        String letra;
        String resultado;
        System.out.println("DIGITE A LETRA F OU J:\n");
        letra = escreva.nextLine();
        
        switch(letra){
            case "F": resultado = "PESSOA FISICA";
        break;
            case "J": resultado = "PESSOA JURÍDICA";    
        break;
        default: resultado = "TIPO DE PESSOA INVÁLIDO";
        } 
        
        System.out.println(resultado);
    }
    
    
}
 
