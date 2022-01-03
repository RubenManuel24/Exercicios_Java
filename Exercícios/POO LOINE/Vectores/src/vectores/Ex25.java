
package vectores;

import java.util.Scanner;

public class Ex25 {
    public static void main(String[] args) {
        Scanner leia= new Scanner(System.in);
        
        int[] vetA= new int[10];
        int[] vetB= new int[10];
        int[] vetC= new int[10];
        
        for(int cont=0; cont<vetA.length; cont++){
            
            System.out.println("VALOR DO VETOR A NA POSIÇÃO "+(cont+1)+" :");
            vetA[cont]=leia.nextInt();
            System.out.println("VALOR DO VETOR B NA POSIÇÃO "+(cont+1)+" :");
            vetB[cont]=leia.nextInt();
            
            if(vetA[cont]>vetB[cont]){
              vetC[cont]=1;
            }
            else if(vetA[cont]==vetB[cont]){
              vetC[cont]=0;
            }
            else{
              vetC[cont]=-1;
            }
            
        }
        
        for(int cont=0; cont<vetC.length; cont++){
            System.out.println("VALOR DO VETOR C NO ÍNDICE "+(cont+1)+" : "+vetC[cont]);
        
        }
    }
}
