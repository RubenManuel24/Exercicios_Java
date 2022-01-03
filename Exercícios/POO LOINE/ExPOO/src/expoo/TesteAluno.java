
package expoo;

import java.util.Scanner;

public class TesteAluno {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        Aluno A1 = new Aluno();
        
        System.out.println("ENTRE COM O NOME DO ALUNO:");
        A1.setNome(leia.nextLine());
        
        System.out.println("ENTRE COM O NOME DO CURSO:");
        A1.setCurso(leia.nextLine());
        
        System.out.println("ENTRE COM A MATRÍCULA:");
        A1.setMatricula(leia.nextLine());
        
        
        for(int i=0; i<A1.getNomeDisciplinas().length; i++){
            System.out.println("ENTRE COM O NOME DA DISCIPLINA DA POSIÇÃO "+(i+1)+" :");
            A1.nomeDisciplinas[i]=leia.nextLine();
        
        }
        for(int i=0; i<A1.getNotasDisciplinas().length; i++){
            System.out.println("OBTENDO NOTAS DA DISCIPLINA "+A1.nomeDisciplinas[i] );  
            for(int j=0; j<A1.getNotasDisciplinas()[i].length; j++){
                System.out.println("ENTRE COM A NOTA "+(j+1)+" :");
                A1.notasDisciplinas[i][j]=leia.nextDouble();
            }
        
        }
    }
    
}
