
package excondicional;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner leia= new Scanner(System.in);
        double n1,n2,media=0;
        String conceito="";
        
        System.out.println("DIGITE A PRIMEIRA NOTA:");
        n1=leia.nextDouble();
        System.out.println("DIGITE A SEGUNDA NOTA:");
        n2=leia.nextDouble();
        media=(n1+n2)/2;
        
        if(media>=9 && media<=10){
          conceito ="A";
        }
        else if(media >=7.5 && media<=9){
          conceito="B";
        }
        else if(media >= 6 && media <=7.5){
          conceito="C";
        }
        else if(media >=4 && media<=6){
          conceito="D";
        }
        else if(media<4 ){
        
         conceito="E";
        }
        System.out.println("\n");
        System.out.println("A PRIMEIRA NOTA É: "+n1);
        System.out.println("A SEGUNDA NOTA É: "+n2);
        System.out.printf("A MÉDIA É %.1f\n",media);
        System.out.println("CONCEITO: "+conceito);
        
        switch(conceito){
            case "A": System.out.println("APROVADO");
               break;
            case "B": System.out.println("APROVADO");
               break;
            case "C": System.out.println("APROVADO");
               break;
            case "E": System.out.println("REPROVADO");
               break;
            case "D": System.out.println("REPROVADO");
               break;
                     
        }
        
        
    }
    
}
