
package exloops;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int valor;
        boolean validar=true;
        
        while(validar==true){
        System.out.println("DIGITE UM VAKOR:");
        valor=leia.nextInt();
        
        if(valor>=0 && valor<=10){
            
            System.out.println("VALOR VALIDO");
            validar=false;
        }
        
        else{
            System.out.println("VALOR INVÁLIDO DIGITA NOVAMENTE:");
            validar=true;
        }
        }
    } 
}
