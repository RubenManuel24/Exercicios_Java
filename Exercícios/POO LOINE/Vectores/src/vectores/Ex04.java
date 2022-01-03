
package vectores;

import java.util.Scanner;

public class Ex04 {
     public static void main(String[] args) {
         Scanner leia = new Scanner(System.in);
        int[] vetA= new int[15];
        int[] vetB= new int[15];
        
        for(int cont=0; cont<vetA.length; cont++){
            System.out.println("DIGITE O VALOR DO VETOR "+(cont+1)+" :");
            vetA[cont]=leia.nextInt();
            vetB[cont]=(int) Math.sqrt(vetA[cont]);
        }
        for(int cont=0; cont<vetA.length; cont++){
            System.out.println("VALOR DO VETOR "+(cont+1)+" :"+vetB[cont]);
     
     }
    }
}
