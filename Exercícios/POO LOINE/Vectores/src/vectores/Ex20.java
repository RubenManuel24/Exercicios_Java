
package vectores;

import java.util.Scanner;

public class Ex20 {
     public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
       
        int[] tabuada= new int[5];
        
        for(int cont=0; cont<tabuada.length; cont++){
            System.out.println("DIGITE O VALOR:");
            tabuada[cont]=leia.nextInt();
        }
        
        for(int cont=0; cont<tabuada.length; cont++){
          
            
            for(int a=1; a<=10; a++ ){
                int mult;
                mult=tabuada[cont]*a;
                System.out.println(tabuada[cont]+"x"+a+"="+mult);
            
            }
            System.out.println("======================================");
        
        }
    }
}
