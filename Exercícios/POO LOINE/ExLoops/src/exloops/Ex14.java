
package exloops;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int quant;
        int cont=1;
        double soma=0;
        double media;
        double preco;
        
        System.out.println("DIGITE A QUANTIDADE DOS CDs:");
        quant=leia.nextInt();
        
        while(cont<=quant){
            System.out.printf("DIGITE O PREÇO DO %d CDs: ",cont);
            preco=leia.nextDouble();
            
            soma=soma+preco;
            cont++;
            
        }
        
        media=soma/cont;
        System.out.printf("O VALOR TOTAL GASTO NA COLEÇÃO DOS CDs É DE: %.1f Kz\n ",soma);
        System.out.printf("E O VALOR MÉDIO GASTO EM CADA UM DELES É DE: %.1f Kz\n ",media);
        
        
    }
}
