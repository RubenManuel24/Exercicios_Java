
package vectores;

import java.util.Scanner;

public class Ex09 {
     public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int [] vetA= new int[10];
        
        
        for(int cont=0; cont<vetA.length; cont++){
            System.out.println("DIGITE O VALOR DO VETOR A NO INDICE "+(cont+1)+" : ");
            vetA[cont]=leia.nextInt();
        
        }
        for(int cont=0; cont<vetA.length; cont++){
         if(vetA[cont]%2==0){
             System.out.println("O VALOR DO VECTOR A NO INDICE "+(cont+1)+" É :"+vetA[cont]);
         }
        
        }
    }
}
