
package exerciicosbasico;

import java.util.Scanner;

public class Ex11 {
    
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int pesoRegulado=50;
        double peso;
        double multa;
        double excesso;
        
        System.out.println("DIGITE O PESO DO PEIXE: ");
        peso = leia.nextDouble();
        
        if(peso<=pesoRegulado){
            excesso=0;
            multa=0;
            System.out.println("Excesso: "+excesso);
            System.out.println("Multa: "+multa);
        }
        else{
        
            excesso=(peso-pesoRegulado);
            multa=4*excesso;
            System.out.printf("Excesso: %.1f\n",excesso);
            System.out.printf("Multa: %.1f\n",multa);
        
        }
        
        
    }
}
