package excondicional;

import java.util.Scanner;

public class Ex05 {
    
    public static void main(String[] args) {
        Scanner leia= new Scanner(System.in);
        double n1,n2,media;
        
        
        System.out.println("DIGITE A PRIMEIRA NOTA:");
        n1=leia.nextDouble();
        System.out.println("DIGITE A SEGUNDA NOTA:");
        n2=leia.nextDouble();
        media=(n1+n2)/2;
        
        if(media>=7){
            System.out.printf("A MEDIA FOI %.1f O ALUNO ESTÁ APROVADO\n",media);
        }
        else if(media<7){
            System.out.printf("A MEDIA FOI %.1f O ALUNO ESTÁ REPROVADO\n",media);
        }
        else if(media>7 && media==10){
            System.out.printf("A MEDIA FOI %.1f O ALUNO APROVOU COM DISTINÇÃO\n",media);
        }
        
    }
    
}
