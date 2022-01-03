
package vectores;

import java.util.Scanner;

public class Ex19 {
     public static void main(String[] args) {
         Scanner leia = new Scanner(System.in);
         int[] vetA = new int[10];
         
         for(int cont=0; cont<vetA.length; cont++){
            
              System.out.println("DIGITE O VALOR DO VETOR NA POSIÇÃO "+(cont+1)+" :");
              vetA[cont]=leia.nextInt();
         }
         
        for(int cont=0; cont<vetA.length; cont++){
            
            if(vetA[cont]%1==0 && vetA[cont]%vetA[cont]==0){
                System.out.println("VALOR "+vetA[cont]+" É PRIMO");
            }
            else{
            System.out.println("VALOR "+vetA[cont]+" É NÃO PRIMO");
            
            }
        
        }
    }
}
