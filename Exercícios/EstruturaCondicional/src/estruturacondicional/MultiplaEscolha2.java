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
public class MultiplaEscolha2 {
    public static void main (String[]args){
        Scanner escreva = new Scanner(System.in);
        String tema;
        int numero1;
        int numero2;
        
        System.out.println("TEMAS:\na) PROGRAMAÇÃO\nb) CULTURA GERAL\n");
        System.out.println("ESCOLHA O TEMA:");
        tema = escreva.nextLine();
        
        
        switch (tema) {
            case "a":
                System.out.println(">>QUESTÕES SOBRE PROGRAMAÇÃO<<\n\n");
                System.out.println("1. O HTML É UMA LINGUAGEM DE PROGRAMAÇÃO.\n\n2. JAVA É UNA LINGUAGEM DE PROGRAMAÇÃO.\n\n3. A LINGUAGEM PHP É MAIS USADA NA WEB EM RELAÇÃO O JAVA.\n\n4. BACK-END É A PROGRAMAÇÃO DE CÓDIGO FORA DO ALCANCE DOS OLHOS DO UTILISADOR FINAL.\n\n");
                System.out.println("DIGITE A QUESTÃO ERRADA:");
                numero1 = escreva.nextInt();
                if(numero1 == 1){
                    System.out.println("CERTO");
                }
                else if(numero1 == 2){
                    System.out.println("ERRADO");
                }
                else if(numero1 == 3){
                    System.out.println("ERRADO");
                }
                else if(numero1 == 4){
                    System.out.println("ERRAOD");
                }
                else{
                    System.out.println("ESSA OPÇÃO NÃO EXISTE");
                }    break;
            case "b":
                System.out.println(">>QUESTÕES SOBRE CULTURA GERAL<<\n\n");
                System.out.println("1. ANGOLA É UM PAÍS EUROPEU\n\n2. A CAPITAL DE ANGOLA É LUANDA\n\n3. O RIO MAIS LONGO DE ÁFRICA CHAMA-SE RIO KWANZA\n\n4. EGIPTO LOCALIZA-SE NO SUL DE ÁFRICA.\n\n");
                System.out.println("DIGITE A QUESTÃO CERTA:");
                numero2 = escreva.nextInt();
                if(numero2 == 1){
                    System.out.println("ERRADO");
                }
                else if(numero2 == 2){
                    System.out.println("CERTO");
                }
                else if(numero2 == 3){
                    System.out.println("ERRADO");
                }
                else if(numero2 == 4){
                    System.out.println("ERRADO");
                }
                else{
                    System.out.println("ESSA OPÇÃO NÃO EXISTE");
                } break;
            default:
                System.out.println("ESSA AOPÇÃO DO TEMA NÃO EXISTE");
                break;
        }
    }
}
