
package exloops;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int  valor;
        int cont=0;
        int soma=0;
        System.out.println("DIGITE UM VALOR:");
        valor=leia.nextInt();
        
        while(cont<=valor){
            soma=soma+cont;
        cont++;
                
        }
        System.out.println("O SOMATÓRIO É: "+soma);
    }
}
