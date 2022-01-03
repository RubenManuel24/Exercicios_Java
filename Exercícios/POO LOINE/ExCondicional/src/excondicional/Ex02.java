package excondicional;

import java.util.Scanner;

public class Ex02 {
    
    public static void main(String[] args) {
        
        Scanner leia=new Scanner(System.in);
        double a;
        System.out.println("DIGITE UM VALOR:");
        a=leia.nextInt();
        
        if(a<0){
            System.out.println("O VALOR É NEGATIVO");
        }
        else{
            System.out.println("O VALOR É POSITIVO");
        }
    }
    
}
