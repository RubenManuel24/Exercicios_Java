
package exerciicosbasico;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        double altura;
        double pesoIdeal;
        
        System.out.println("DIGITE A ALTURA DA PESSOA:");
        altura=leia.nextDouble();
        pesoIdeal=((72.7*altura)-58);
        System.out.printf("O SEU PESO IDEAL É DE: %.1f ",pesoIdeal);
    }
    
}
