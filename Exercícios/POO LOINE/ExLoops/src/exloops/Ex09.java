
package exloops;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        int n;
        int cont=1;
        int mult;
        Scanner leia = new Scanner(System.in);
        System.out.println("TABUADA DE:");
        n=leia.nextInt();
        System.out.println("");
        while(10>cont){
            
            mult=n*cont;
            System.out.printf("%d x %d = %d\n",n,cont,mult);
            
            cont++;
        }
        
        
        
    }
  
}
