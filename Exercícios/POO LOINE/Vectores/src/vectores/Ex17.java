
package vectores;

import java.util.Scanner;

public class Ex17 {
     public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        double[] nota1= new double[10];
        double[] nota2=new double[10];
        double[] result=new double[10];
        
        
        for(int cont=0; cont<nota1.length; cont++){
        
            System.out.println("DIGITE A PRIMEIRA NOTA DO ALUNO "+(cont+1)+ " :");
            nota1[cont]=leia.nextDouble();
            System.out.println("DIGITE A SEGUNDA NOTA DO ALUNO "+(cont+1)+ " :");
            nota2[cont]=leia.nextDouble();
            
            result[cont]=(nota1[cont]+nota2[cont])/2;
        }
        
        
        for(int cont=0; cont<nota1.length; cont++){
            
            if(result[cont]>=7){
            
                System.out.println("O ALUNO "+(cont+1)+" ESTÁ APROVADO");
            }
            else{
            
                System.out.println("O ALUNO "+(cont+1)+" ESTÁ REPROVADO");
            
            }
        
        
        }
    }
}
