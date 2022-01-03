
package excondicional;

import java.util.Scanner;

public class Ex13 {
    
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int numero;
        
        System.out.println("DIGITE UM NÚMERO:");
        numero=leia.nextInt();
        
        if(numero%2==0){
            System.out.println("O NÚMERO É PAR");
        }
        else{
            System.out.println("O NÚMERO É IMPAR");
        }
        
    }
    
}
