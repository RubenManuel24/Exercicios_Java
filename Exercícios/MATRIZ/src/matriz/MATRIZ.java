/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriz;

/**
 *
 * @author FATIMA30
 */
public class MATRIZ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[][] notasAlunos = new double[3][4];
        
        notasAlunos [0][0]=2;
        notasAlunos [0][1]=5;
        notasAlunos [0][2]=3.4;
        notasAlunos [0][3]=10.5;
        
        notasAlunos [1][0]=10;
        notasAlunos [1][1]=23;
        notasAlunos [1][2]=10;
        notasAlunos [1][3]=1;
        
        notasAlunos [2][0]=10;
        notasAlunos [2][1]=23;
        notasAlunos [2][2]=10;
        notasAlunos [2][3]=112.5;
        
        double soma;
        double media;
        for(int i=0; i<notasAlunos.length; i++){
            
            for(int j=0; j<notasAlunos[i].length; j++){
                System.out.print(notasAlunos[i][j] + "-");
                
            }
            System.out.println();
        }
        
        System.out.println("CALULO DA MEDIA DOS ALUNOS:");
        
        for(int i=0; i<notasAlunos.length; i++){
        soma=0;
       
        for(int j=0; j<notasAlunos[i].length; j++){
           
           
           soma+=notasAlunos[i][j];
        
        }
            media=soma/4;
            System.out.printf("A MEDIA DO ALUNO " + i + " É = %.1f\n ",media);
        }
    }
    
}
