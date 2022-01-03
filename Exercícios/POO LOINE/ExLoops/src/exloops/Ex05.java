
package exloops;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int n;
        int maior = 0;
        for(int cont=1; cont<=5; cont++){
            System.out.println("IGITE OS VALORES:");
            n=leia.nextInt();
            maior=cont;
        }
        System.out.println(maior);
    }
}
