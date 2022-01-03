
package vectores;

import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int[] vetA= new int[10];
        
        int[] vetB = new int[10];
        int[] vetC = new int[10];
        
        for(int cont=0; cont<vetA.length; cont++){
            
        System.out.println("DIGITE O VALOR:");
        vetA[cont]=leia.nextInt();
       
        if(vetA[cont]%2==0){
          
           vetB[cont]=vetA[cont];
            
        }
        else{
     
             vetC[cont]=vetA[cont];
        
        }
        
        }
        
        for(int cont=0; cont<vetA.length; cont++){
            System.out.println("VALOR PARES: "+vetB[cont]);
            System.out.println("VALOR IMPARES: "+vetC[cont]);
        
        }
        
    }
    
}
