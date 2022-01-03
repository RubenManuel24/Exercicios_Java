
package exloops;

import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
 Scanner leia = new Scanner(System.in);
 
      int quant;
      double temp;
      double soma=0;
      double media;
     double maior=Double.MAX_VALUE;
     double menor=Double.MIN_VALUE;
      
        System.out.print("ENTRE COM A QUANTIDADE DA TEMPERATURA: ");
        quant=leia.nextInt();
        
        for(int cont=1; cont <=quant; cont++){
        
            System.out.println("DIGITE AS TEMPERATURAS:");
            temp=leia.nextDouble();
            soma=soma+temp; 
            
            if(temp>maior){
               menor=temp;
            }
            if(temp>menor){
               maior=temp;
            }
        }    
         media=soma/quant;
        
         
        System.out.printf("MAIOR TEMPERATURA: %.1f \n",menor);
        System.out.printf("MENOR TEMPERATURA: %.1f \n",maior);
 
  }
}



