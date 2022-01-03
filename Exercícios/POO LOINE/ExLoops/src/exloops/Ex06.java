
package exloops;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner leia=new Scanner(System.in);
        double media=0;
        int soma=0;
        
        for(int cont=1;cont<=5;cont++){
            System.out.println("DIGITE O VALOR:");
            int a=leia.nextInt();
            
            soma=soma+a;
        }
            media=soma/5;
            System.out.println("A SOMA É: "+soma);
            System.out.printf("A MÉDIA É: %.1f",media);
    }
            
    
}
