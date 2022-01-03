
package exerciicosbasico;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
       Scanner leia = new Scanner(System.in);
       int n1;
       int n2;
       int soma;
        System.out.println("DIGITE O PRIMEIRO NÚMERO: ");
        n1=leia.nextInt();
        System.out.println("DIGITE O SEGUNTO SEGUNDO: ");
        n2=leia.nextInt();
        soma=n1+n2;
        System.out.println("A SOMA DOS DOIS NUMEROS SÃO: "+soma);
    }
    
}
