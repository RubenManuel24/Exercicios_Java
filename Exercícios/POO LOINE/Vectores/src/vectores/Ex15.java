
package vectores;

import java.util.Scanner;

public class Ex15 {
     public static void main(String[] args) {
        Scanner leia= new Scanner(System.in);
        int[] vetIdade= new int[10];
        int a=0;
        
        for(int cont=0; cont<vetIdade.length; cont++){
        
            System.out.println("DIGITE AS IDADES DAS PESSOAS:");
            vetIdade[cont]=leia.nextInt();
            
            if(vetIdade[cont]>35){
               a++;
            }
        }
        
         System.out.println("A QUANTIDADE DE PESSOAS QUE POSSUEM IDADE SUPERIOR A 35 É: "+a);
    }
}
