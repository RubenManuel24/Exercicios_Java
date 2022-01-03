
package vectores;

import java.util.Scanner;

public class Ex12 {
     public static void main(String[] args) {
        Scanner leia= new Scanner(System.in);
        int[] vetA= new int[10];
        int soma=0;
        double media;
        
        for(int cont=0; cont<vetA.length; cont++){
            System.out.println("ADIONE OS VALORES DO VETORES:");
            vetA[cont]=leia.nextInt();
            
            if(vetA[cont]%2!=0){
            
            soma=soma+vetA[cont];
            
            }
        
        }
        media=soma/vetA.length;
         System.out.println("A MEDIA DOS VALORES IMPARES IMPLEMENTADOS NO VETOR É: "+media);
    }
}
