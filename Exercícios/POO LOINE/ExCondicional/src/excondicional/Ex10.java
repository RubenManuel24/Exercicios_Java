
package excondicional;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        double salario=0;
        double novoSalario=0;
        int percentual=0;
        double aumento=0;
        
        System.out.println("DIGITE O SALÁRIO:");
        salario=leia.nextDouble();
        System.out.printf("SALÁRIO ANTES DO REAJUSTE: %.1f Kz\n",salario);
        
        if(salario<=280){
            
             percentual=20;
             System.out.println("FOI AUMENTADO 20%");
        
        }
        else if(salario > 280 && salario<=700){
            
             percentual=15;
             System.out.println("FOI AUMENTADO 15%");
        
        }
        else if(salario>700 && salario<=1500){
            percentual=10;
             System.out.println("FOI AUMENTADO 10%");
        }
        else{
             percentual=5;
             System.out.println("FOI AUMENTADO 5%");
        }
         aumento=(salario/100)*percentual;
         novoSalario=aumento+salario;
         System.out.println("");
         System.out.printf("O SALÁRIO APÓS O AUMENTO É: %.1f Kz\n",novoSalario);
        
    }
    
}
