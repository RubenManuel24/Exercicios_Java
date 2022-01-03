
package vectores;

import java.util.Scanner;

public class Ex18 {
     public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int[] vetA = new int[10];
        int[] vetB = new int[10];
        int fatorial=1;
       
        for(int cont=0; cont<vetA.length; cont++){
            System.out.println("DIGITE OS VALORES DO VETOR: ");
            vetA[cont]=leia.nextInt();
           vetB[cont]=1;
            for(int a=1; a<=vetA[cont]; a++){
               vetB[cont]*=a;
               
            }
        
        }
        
        for(int cont=0; cont<vetA.length; cont++){
        
            System.out.println("VALOR DO VETOR B: "+vetB[cont]);
        }
    }
}
