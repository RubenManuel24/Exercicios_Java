
package vectores;

import java.util.Scanner;

public class Ex14 {
     public static void main(String[] args) {
        Scanner leia= new Scanner(System.in);
        
        int[] vetA= new int[10];
        int soma1=0;
        int a=0;
        int soma3=0;
        int b=0;
        double media;
        for(int cont=0; cont<vetA.length; cont++){
        
            System.out.println("DIGITE OS VALORES DO VETOR:");
            vetA[cont]=leia.nextInt();
            
            if(vetA[cont]<15){
            
            soma1=soma1+vetA[cont];
            
            }
            else if(vetA[cont]==15){
              a++;
             
            }
            
            else{
        
               b++;
               soma3=soma3+vetA[cont];
            }
        }
         media=soma3/b;
         
         System.out.println("A SOMA DOS VALORES QUE SÃO INFERIOR A 15 É: "+soma1);
         System.out.println("A QUANTIDADE DE VALORES IGUAL A 15 É DE: "+a);
         System.out.println("A MEDIA DOS ELEMENTOS ARMAZENADOS NO VETOR QUE SÃO SUPERIOR A 15 É DE: "+media);
    }
}
