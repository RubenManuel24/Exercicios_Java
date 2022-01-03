
package exerciicosbasico;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double faren;
        double cels;
        System.out.println("DIGITE A TEMPERATURA EM GRAUS FARENHEIT: ");
        faren=leia.nextInt();
        cels=(5*(faren-32)/9);
        System.out.printf("A CONVERSÃO EM GRAUS CELSIUS É DE:\n%.2f",cels);
        
        
    }
    
}
