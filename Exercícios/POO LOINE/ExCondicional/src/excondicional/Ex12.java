
package excondicional;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner leia=new Scanner(System.in);
        
        int ano;
        
        System.out.println("DIGITE O ANO:");
        ano=leia.nextInt();
        
        if(ano%4==0){
            System.out.printf("O ANO %s É BISSEXTO\n",ano);
        
        }
        else{
            System.out.printf("O ANO %s NÃO É BISSEXTO\n",ano);
        
        }
    }
    
}
