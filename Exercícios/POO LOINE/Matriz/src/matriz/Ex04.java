
package matriz;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner leia= new Scanner(System.in);
        int[][] matriz= new int[3][3];
        
        int a=0;
        int b=0;
        
        for(int i=0; i<matriz.length; i++){
          for(int j=0; j<matriz[i].length; j++){
              System.out.println("DIGITE O VALOR DO VETOR NA LINHA "+(i+1)+" COLUNA "+(j+1)+" :");
              matriz[i][j]=leia.nextInt();
              
              if(matriz[i][j]%2==0){
                a++;
              }
              else{
               b++;
              }
          }  
        }
        
        System.out.println("\n");
            System.out.println(">>>>VALOES DA MATRIZ<<<<\n");
       for(int i=0; i<matriz.length; i++){
           for(int j=0; j<matriz[i].length; j++){
               System.out.print(matriz[i][j]+" ");
           }
            System.out.println("\n");
        }
       
        System.out.println("A QUANTIDADE DE PARES É DE "+a);
        System.out.println("A QUANTIDADE DE IMPARES É DE "+b);
    }
}
