
package vectores;

import java.util.Scanner;

public class Ex08 {
     public static void main(String[] args) {
         Scanner leia = new Scanner(System.in);
        int[] veA= new int[10];
        int[] veB= new int[10];
        int[] veC= new int[10];
        
        for(int cont=0; cont<veB.length; cont++){
            System.out.println("ADICIONE O VALOR DO VETOR A NO INDICE "+(cont+1)+" :");
            veA[cont]=leia.nextInt();
            System.out.println("ADICIONE O VALOR DO VETOR B NO INDICE "+(cont+1)+" :");
            veB[cont]=leia.nextInt();
            veC[cont]=veA[cont]*veB[cont];
        }
        for(int cont=0; cont<veA.length; cont++){
            System.out.println("O VALOR DO VETOR C NO INDICE "+(cont+1)+" :"+veC[cont]);
        
        }
    }
}
