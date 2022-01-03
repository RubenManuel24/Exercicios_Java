
package exloops;

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int valor;
        int cont=1;
        int factorial=1;
        System.out.print("FACTORIAL DE:" );
        valor=leia.nextInt();
        System.out.print(valor+"!= ");
        while(cont<=valor){
        
            factorial=factorial*cont;
            System.out.print(cont+".");
            cont++;
        }
       System.out.print("="+factorial);
    }
    
}
