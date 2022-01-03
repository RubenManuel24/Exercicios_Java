
package exloops;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        int cont=1;
        int a;
        int par=0;
        int impar=0;
        while(cont<=10){
        
            System.out.println("DIGITE O VALOR:");
            a=leia.nextInt();
            if(a%2==0){
              par++;
            
            }
            else{
            impar++;
            
            }
           cont++;
        
        } 
            System.out.printf(" TEM %d PARES E %d IMPAR\n",par,impar);
           
    }
    
}
