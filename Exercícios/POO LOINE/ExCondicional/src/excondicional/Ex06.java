package excondicional;

import java.util.Scanner;

public class Ex06 {
    
    public static void main(String []args){
    
       Scanner leia = new Scanner(System.in);
       double n1=0;
       double n2=0;
       double n3=0;
    
        System.out.println("DIGITE O PRIMEIRO NÚMERO:");
        n1=leia.nextDouble();
         System.out.println("DIGITE O PRIMEIRO NÚMERO:");
        n2=leia.nextDouble();
         System.out.println("DIGITE O PRIMEIRO NÚMERO:");
        n3=leia.nextDouble();
        
        if(n1>n2 && n1>n3){
            System.out.printf("O MAIOR NÚMERO É: %.1f\n",n1);
        }
        else if(n2>n1 && n2>n3){
           System.out.printf("O MAIOR NÚMERO É: %.1f\n",n2);
        } 
        
        else{
        
           System.out.printf("O MAIOR NÚMERO É: %.1f\n",n3);
        }
    }   
}
