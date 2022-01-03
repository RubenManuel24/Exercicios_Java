package excondicional;

import java.util.Scanner;

public class Ex07 {
    
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double pre1,pre2,pre3;
        
        System.out.println("QUAL É O PREÇO DA SAPATO: ");
        pre1=leia.nextDouble();
        System.out.println("QUAL É O PREÇO DO CALSÃO: ");
        pre2=leia.nextDouble();
        System.out.println("QUAL É O PREÇO DA CAMISA: ");
        pre3=leia.nextDouble();
        
        if(pre1<pre2 && pre1<pre3){
            System.out.println("DEVES COMPRAR O SAPATO");
        }
        else if(pre2<pre1 && pre2<pre3){
            System.out.println("DEVES COMPRAR O CALSÃO");
        }
        else{
            System.out.println("DEVES COMPRAR A CAMISA");
        }
        
    }
    
}
