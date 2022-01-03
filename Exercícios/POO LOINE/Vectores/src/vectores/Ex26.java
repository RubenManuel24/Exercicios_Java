
package vectores;

import java.util.Scanner;

public class Ex26 {
    public static void main(String[] args) {
        Scanner leia= new Scanner(System.in);
        
        int[] vetA= new int[10];
        char[] vetB= new char[10];
        
        
        for(int cont=0; cont<vetA.length; cont++){
            System.out.println("VALOR DO VETOR A NO ÍNDICE "+(cont+1)+" :");
            vetA[cont]=leia.nextInt();
            
            if(vetA[cont]<7){
             vetB[cont]='a';
            }
            else if(vetA[cont]==7){
             vetB[cont]='b';
            }
            else if(vetA[cont]>7 && vetA[cont]<10){
            vetB[cont]='c';
            }
            else if(vetA[cont]==10){
              vetB[cont]='d';
            }
            else{
            vetB[cont]='e';
            
            }
            
        }
        for(int cont=0; cont<vetB.length; cont++){
            System.out.println("VALOR DO VETOR B DA POSIÇÃO: "+(cont+1)+" :"+vetB[cont]);
        
        }
    }
            
}
