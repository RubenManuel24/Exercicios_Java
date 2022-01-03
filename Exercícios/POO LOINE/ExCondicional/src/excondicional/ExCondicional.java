
package excondicional;

import java.util.Scanner;

public class ExCondicional {
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        int idade;
        
        System.out.println("DIGITE A IDADE:");
        idade=leia.nextInt();
        
        if(idade>=18){
        
            System.out.println("A PESSOA PODE ENTRAR NA FESTA");
        
        }
        else{System.out.println("A PESSOA ESTÁ PROIBIDA DE ENTRAR NA FESTA");} 
        
    }
    
}
