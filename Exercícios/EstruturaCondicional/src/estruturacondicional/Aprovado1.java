/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturacondicional;

import java.util.Scanner;

/**
 *
 * @author FATIMA30
 */
public class Aprovado1 {
    public static void main(String[]args){
        Scanner escreva = new Scanner(System.in);
        double nota;
        String disciplina;
        double notaf;
        int quantA;
        int quantF;
        double freq;
        
        System.out.println("DITE A DISCIPLINA:\n");
        disciplina = escreva.nextLine();
        
       System.out.print(" DIGITE A NOTA:\n");
       nota = escreva.nextFloat();
       
       System.out.println("DIGITE A QUANTIDADE DE AULA MINISTRADA:\n");
       quantA = escreva.nextInt();
       
       System.out.println("DIGITE A QUANTIDADE DE FALTA DO ALUNO:\n");
       quantF = escreva.nextInt();
       
       notaf = (nota*0.5);
       
       System.out.printf("A TUA NOTA É:\n %.1fv\n",notaf);
       
       freq =(double) (quantA-quantF)/100;
       
       System.out.printf("TENS UMA FREQUÊNCIA DE:\n %.2f NAS AULAS\n",freq);
       
       if(freq >= 0.75){
       
            if(notaf >=5 && notaf <10){
              System.out.println("ESTÁ APROVADO\n");
            }
            else if (nota == 4 || nota == 4.5){
             System.out.println("ESÁS NA SEGUNDA ÉPOCA\n");
            }
       
            else if(nota < 4){
            System.out.println("ESTÁS REPROVADO\n");
            }
            else{
              System.out.println("ERRO\n");
            }
            
       }
       else{
           
          System.out.println("ESTÁS REPROVADO\n");
       }
    
    }
    
}
