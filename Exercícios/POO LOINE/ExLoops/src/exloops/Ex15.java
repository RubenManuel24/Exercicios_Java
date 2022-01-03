
package exloops;

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double preco;
        int cont=1;
        double mult;
        System.out.println("DIGITE O PREÇO DO PÃO:");
        preco=leia.nextDouble();
        
        while(cont<=50){
          
          mult=cont*preco;
          System.out.printf("%d PÃO CUSTA %.1f Kz\n",cont,mult);
          cont++;
        }
        
    }
            
    
}
