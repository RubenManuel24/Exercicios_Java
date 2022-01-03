
package vectores;

import java.util.Scanner;

public class Ex28 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int vetA[]= new int[10];
        
        for(int cont=0; cont<vetA.length; cont++){
            System.out.println("DIGITE OS VALORES:");
            vetA[cont]=leia.nextInt();
            
        }
        for(int cont=0; cont<vetA.length; cont++){
        
           if(vetA[cont]%2==0){
           
               System.out.println("VALORES DO VETOR: "+vetA[cont]);
           } 
           else{
           
              break;
           }
        }
    }
            
}
