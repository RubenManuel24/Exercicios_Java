
package cursodejava;

import java.util.Scanner;


public class CursoDeJava {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        String nome;
        int idade;
        double altura;
        
        System.out.println("DIGITE O SEU NOME COMPLETO: ");
        nome=leia.nextLine();
        System.out.println("DIGITE A SUA IDADE: ");
        idade=leia.nextInt();
        System.out.println("DIGITE A SUA ALTURA: ");
        altura=leia.nextDouble();
        System.out.println("=============================");
        System.out.println("O SEU NOME É: "+nome);
        System.out.println("A SUA IDADE É: "+idade);
        System.out.println("A SUA ALTURA É DE: "+altura);
        
       
           
    }
    
}
