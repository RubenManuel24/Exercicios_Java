
package vectores;

import java.util.Scanner;

public class Ex24 {
    public static void main(String[] args) {
        Scanner leia= new Scanner(System.in);
        int[] vetA= new int[10];
        int[] vetB= new int[10];
        
        for(int cont=0; cont<vetA.length; cont++){
            System.out.println("DIGITE O VALOR DO VETOR A NO ÍNDICE "+(cont+1)+" :");
            vetA[cont]=leia.nextInt();
            
            if(vetA[cont]%2==0){
              
                 vetB[cont]=1;
            }
            else {
                
                vetB[cont]=0;
            }
        
        }
        
        for(int cont=0; cont<vetA.length; cont++){
            System.out.println("VALOR DO VETOR B NO ÍNDICE "+(cont+1)+" :"+vetB[cont]);
        
        }
        
    }
    
}
