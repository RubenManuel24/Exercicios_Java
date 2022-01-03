
package excondicional;

import java.util.Scanner;

public class ExIfElse {
    
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        int preco;
        
        System.out.println("DIGITE O PREÇO:");
        preco=leia.nextInt();
        
        if(preco<=10){
        
            System.out.println("O PRODUTO ESTÁ BARATO");
        }
        else if(preco>10 && preco<15){
        
            System.out.println("QUERO DESCONTO DO PRODUTO");
        }
        else if(preco>=15 && preco<17){
        
            System.out.println("TENHO DE PESQUISAR MAIS PRODUTO");
        }
        else{
        
            System.out.println("O PRODUTO ESTÁ MUITO CARO");
        }
    }
}
