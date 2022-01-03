
package exloops;

import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
         Scanner leia = new Scanner(System.in);  
        int valor;
        int inicio;
        int fim;
        int mult;
        System.out.print("MONTAR A TABUADA DE : ");
        valor=leia.nextInt();
        
        System.out.print("COMEÇAR POR : ");
        inicio=leia.nextInt();
        
        System.out.print("TERMINAR EM : ");
        fim=leia.nextInt();
        
        if(inicio<fim){
            while(inicio<=fim){
               
                mult=valor*inicio;
                System.out.println(valor+"x"+inicio+"="+mult);
            
                inicio++;
            }  
        }
        else{   
              System.out.println("O VALOR INICIAL É MAIOR QUE O VALOR FINAL");  
        }
    }
}
