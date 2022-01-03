
package vectores;

import java.util.Scanner;

public class Ex10 {
     public static void main(String[] args) {
        Scanner leia= new Scanner(System.in);
        int[] vetA= new int[10];
        int soma=0;
        
        for(int cont=0; cont<vetA.length; cont++){
         
            System.out.println("ADICIONE O VALOR DO VETOR NO INDICE "+(cont+1)+" :");
            vetA[cont]=leia.nextInt();
            
            soma=soma+vetA[cont];
            
        }
         System.out.println("A SOMA DE TODOS OS VALORES ADICIONADOS NO VECTOR É: "+soma);
        
        
    }
}
