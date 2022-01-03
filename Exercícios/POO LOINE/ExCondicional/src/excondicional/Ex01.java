package excondicional;

import java.util.Scanner;

public class Ex01 {
    
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        int a,b;
        
        System.out.println("DIGITE O PRIMEIRO:");
        a=leia.nextByte();
        System.out.println("DIGETE O SEGUNDO:");
        b=leia.nextInt();
        
        if(a>b){
            System.out.println("O MAIOR NÚMERO É: "+a);
        }
        else{
            System.out.println("O MAIOR NÚMERO É: "+b);
        }
        
    }
    
}
