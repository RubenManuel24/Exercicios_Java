
package vectores;

import java.util.Scanner;

public class Ex13 {
     public static void main(String[] args) {
        Scanner leia= new Scanner(System.in);
        int[] vetA= new int[10];
        double percImpar;
        double percPar;
        int soma1=0;
        int soma2=0;
        for(int cont=0; cont<vetA.length; cont++){
            System.out.println("ADICIONE VALORES NO VECTOR A:");
            vetA[cont]=leia.nextInt();
            
            if(vetA[cont]%2==0){
            
              soma1=soma1+vetA[cont];
            
            }
            else{
            
                soma2=soma2+vetA[cont];
            
            }
        
        }
        
        percPar=(soma1/100);
        percImpar=(soma2/100);
        
        System.out.println("A PERCENTAGEM DE PARES É DE: "+percPar);
        System.out.println("A PERCENTAGEM DE IMPARES É DE: "+percImpar);
        
    }
}
