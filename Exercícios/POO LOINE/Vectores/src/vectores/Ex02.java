
package vectores;

import java.util.Scanner;

public class Ex02 {
     public static void main(String[] args) {
      Scanner leia= new Scanner(System.in);
         
       int[] a= new int [8];
       int[] b= new int [8];
       
       for(int cont=0; cont<a.length; cont++){
           
           System.out.println("Digite o valor do vector "+cont+" :");
           a[cont]=leia.nextInt();
         
           b[cont]=a[cont]*2;
       
       }
        for(int cont=0; cont<a.length; cont++){
        
            System.out.println("OS VALORES DIGITADOS:"+b[cont]);
        }
    }
}
