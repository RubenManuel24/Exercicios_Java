
package vectores;

import java.util.Scanner;

public class Ex06 {
     public static void main(String[] args) {
         Scanner leia= new Scanner(System.in);
        int[] vetA= new int[10];
        int[] vetB= new int[10];
        int[] vetC= new int[10];
        
        for(int cont=0; cont<vetA.length; cont++){
            System.out.println("ADICIONE VALOR NO VETOR A NO INDICE"+(cont+1)+" :");
            vetA[cont]=leia.nextInt();
             System.out.println("ADICIONE VALOR NO VETOR B NO INDICE"+(cont+1)+" :");
            vetB[cont]=leia.nextInt();
            
            vetC[cont]=vetA[cont]+vetB[cont];
        }
        
        for(int cont=0; cont<vetB.length; cont++){
            System.out.println("VALOR DO VETOR C, INCICE"+(cont+1)+": "+vetC[cont]);
        
        }
    }
}
