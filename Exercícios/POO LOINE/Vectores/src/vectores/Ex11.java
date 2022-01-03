
package vectores;

import java.util.Scanner;

public class Ex11 {
     public static void main(String[] args) {
        Scanner leia= new Scanner(System.in);
        int[] vetA= new int[10];
        int soma=0;
        for(int cont=0; cont<vetA.length; cont++){
        
            System.out.println("ADIOCIONE OS VALORES DO VECTOR:");
            vetA[cont]=leia.nextInt();
            
            if(vetA[cont]%5==0){
            
               soma=soma+vetA[cont];
            }
            
        }
         System.out.println("A SOMA DE TODOS OS VALORES MULTIPLO POR 5 SÃO: "+soma);
        
        
    }
}
