
package excondicional;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        double n1,n2;
        int escolha;
        double soma,div,mult,sub,result=0;
        boolean valida=true;
        
        System.out.println("DIGITE O PRIMEIRO NÚMERO:");
        n1=leia.nextInt();
        System.out.println("DIGITE O SEGUNDO NÚMERO:");
        n2=leia.nextInt();
        System.out.println("\n");
        System.out.println("QUAL É A OPERAÇÁO QUE QUERES REALIZAR:\n1.SOMA;\n2.MULTIPICAÇÃO;\n3.DIVISÃO;\n4.SUBTRAÇÃO.");
        System.out.println("DIGITE UMA ESCOLHA:");
        escolha=leia.nextInt();
        System.out.println("\n");
        
        switch(escolha){
            case 1:
                soma=n1+n2;
                result=soma;
                
            break;
                
            case 2: 
                mult=n1*n2;
                result=mult;
                
            break;
                
            case 3:
                div=n1/n2;
                result=div;
            break;
                
            case 4:
                sub=n1-n2;
                result=sub;
            break;
            
            default: System.out.println("ESCOLHA INVÁLIDA");
               valida=false;
                
        }
        if(valida==true){
        System.out.printf("O RESULTADO: %.1f\n",result);
        
        if(result%2==0){
            System.out.println("O RESULTADO É UM VALOR PAR");
        
        }
        else{
            System.out.println("O RESULTADO É UM VALOR IMPAR");
        
        }
        if(result>0){
            System.out.println("O RESULTADO É UM VALOR POSSITÍVO");
        }
        else{
           System.out.println("O RESULTADO É UM VALOR NEGATIVO");
        
        }
        }
        
            
       
    }
    
    
}
