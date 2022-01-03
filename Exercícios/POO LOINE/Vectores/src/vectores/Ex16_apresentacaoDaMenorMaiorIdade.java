
package vectores;

import java.util.Scanner;
//REVER MELHOR
public class Ex16_apresentacaoDaMenorMaiorIdade {
     public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int[] idades = new int [9];
        
        
        for(int cont=1; cont<idades.length; cont++){
            System.out.println("DIGITE AS IDADES DAS PESSOA: ");
            idades[cont]=leia.nextInt();
        }
        
        int menor=idades[0];
        int posimenor=0;
        int maior=idades[0];
        int posimaior=0;
        
        for(int cont=1; cont<idades.length; cont++){
         if(idades[cont]>maior){
           maior= idades[cont];
           posimaior=cont;
         }
         else if(idades[cont]<menor){
             menor=idades[cont];
             posimenor=cont;
         }
         
         }
         System.out.println("A MAIOR IDADE É : "+maior+" E ESTÁ NA POSIÇÃO "+posimaior);
         System.out.println("A MENOR IDADE É : "+menor+" E ESTÁ NA POSIÇÃO "+posimenor);
        
        
       
    }
}
