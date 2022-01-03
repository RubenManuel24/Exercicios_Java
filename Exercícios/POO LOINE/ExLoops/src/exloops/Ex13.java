
package exloops;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner leia=new Scanner(System.in);
        int quant;
        int soma=0;
        int nota;
        double media;
        System.out.println("DIGITE A QUANTIDADE DE NOTA:");
        quant=leia.nextInt();
        
        for(int cont=1; cont<=quant; cont++){
            System.out.println("DIGITE A NOTA:");
            nota=leia.nextInt();
            
            soma=soma+nota;
        
        }
         media=soma/quant;
         System.out.printf("A MEDIA É: %.1f",media);
    }
            
}
