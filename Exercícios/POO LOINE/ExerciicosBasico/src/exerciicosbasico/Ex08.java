
package exerciicosbasico;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int n1,n2;
        double n3;
        int produt;
        double soma;
        double cubo;
        
        System.out.println("DIGITE O PRIMEIRO NÚMERO: ");
        n1=leia.nextInt();
        System.out.println("DIGITE O SEGUNDO NÚMERO: ");
        n2=leia.nextInt();
        System.out.println("DIGITE O TERCEIRO NÚMERO: ");
        n3=leia.nextDouble();
        
        produt=((2*n1)*(n2/2));
        soma=((3*n1)+ n3);
        cubo=Math.pow(n3,3);
        
        System.out.println("O PRODUTO DO DOBRO DO PRIMEIRO COM METADE DO SEGUNDO É: "+produt);
        System.out.println("A SOMA DO TRIPLO DO PRIMEIRO COM O TERCEIRO É: "+soma);  
        System.out.println("O TERCEIRO ELEVADO AO CUBO: "+cubo);
    }
}
