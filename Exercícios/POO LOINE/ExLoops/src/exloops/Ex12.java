
package exloops;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int a;
        int soma=0;
        int idade;
        int media;
        System.out.println("DIGITE A QUANTIDADE DE PESSOA:");
        a=leia.nextInt();
        
        
        for(int cont=1; cont<=a; cont++){
          
            System.out.println("DIGITE A IDADE: ");
            idade=leia.nextInt();
            
            soma=soma+idade;
           
        }
        
         media=soma/a;
         
        if(media >=0 && media<=25){
            System.out.println("A TURMA É JOVEM");
        }
        else if(media>=26 && media<=60){
            System.out.println("A TURMA É ADULTA");
        }
        else{
             System.out.println("A TURMA É IDOSA");        
        }
        
    }
    
}
