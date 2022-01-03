
package estruturacondicional;

import java.util.Scanner;

public class MenuPrincipal {
    public static void main(String[] args) {
        Scanner escreva = new Scanner(System.in);
        
        int opcao;
        
        
        System.out.println("TENS TRÊS OPÇÕES:\n1_FIM;\n2_CADASTRO;\n3_CONSULTA.");
        System.out.println("DIGITE A OPÇÃO:");
        opcao = escreva.nextInt();
        
        if (opcao == 1){
            System.out.println("A OPCÃO ESCOLHIDA FOI FIM");
        }
        else if (opcao == 2){
            System.out.println("A OPÇÃO ESCOLHIDA FOI CADASTRO");
        }
        else if(opcao == 3) {
            System.out.println("A OPÇÁO ESCOLHIDA FOI CADASTRO");
        }
        else { 
            System.out.println("ERRO");
        }
    }
    
}
