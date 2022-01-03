
package exloops;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        
        int a;
        int b;
        int soma = 0;
        System.out.println("DIGITE O PRIMEIRO NÚMERO:");
        a=leia.nextInt();
        System.out.println("DIGITE O SEGUNDO NÚMERO:");
        b=leia.nextInt();
        
        while(a<b){
        
            System.out.println(a);
            a++;
            soma=soma+a;
        }
        System.out.println("A SOMA: "+soma);
        
    }
}
