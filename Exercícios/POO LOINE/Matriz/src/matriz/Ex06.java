
package matriz;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner leia= new Scanner(System.in);
        int[][] matriz= new int[4][4];
        
        for(int i=0; i<matriz.length; i++){
         for(int j=0; j<matriz[i].length; j++){
             System.out.println("O VALOR DA MATRIZ DA LINHA "+(i+1)+" COLUNA "+(j+1)+" :");
             matriz[i][j]=leia.nextInt();
             
         }
            System.out.println("  ");
                
        }
        int maior=matriz[0][0];
        int posi=0;
        
        System.out.println(">>>>VALORES DA MATRIZ<<<<\n");
        
        for(int i=0; i<matriz.length; i++){
         for(int j=0; j<matriz[i].length; j++){
             if(maior<matriz[i][j]){
                maior=matriz[i][j];
             }
             System.out.print(matriz[i][j]+ " ");
         }
            System.out.println("\n");
        }
        System.out.println("O MAIOR NÚMERO É: "+maior);
    }
    
}
