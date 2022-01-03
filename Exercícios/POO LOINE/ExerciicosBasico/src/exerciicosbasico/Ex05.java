
package exerciicosbasico;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner leia=new Scanner(System.in);
        
        double numero;
        double conversao;
        
        System.out.println("DIGITE UM VALOR PARA SER CONVERTIDO DE METRO PARA CENTIMETRO:");
        numero=leia.nextDouble();
        conversao=numero*1000;
        System.out.println(numero+" METROS CONVERTENDO PARA CENTIMETROS É: "+conversao);
        
        
    }
}
