
package exerciicosbasico;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double n1,n2,n3,n4,media;
        System.out.println("DIGITE A PRIMEIRA NOTA: ");
        n1=leia.nextInt();
        System.out.println("DIGITE A SEGUNDA NOTA: ");
        n2=leia.nextInt();
        System.out.println("DIGITE A TERCEIRA NOTA: ");
        n3=leia.nextInt();
        System.out.println("DIGITE A QUARTA NOTA: ");
        n4=leia.nextInt();
        media=(n1+n2+n3+n4)/4;
        System.out.println("A MEDIA É: "+media);
        
    }
    
}
