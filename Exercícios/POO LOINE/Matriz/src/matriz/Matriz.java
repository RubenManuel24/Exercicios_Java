
package matriz;
public class Matriz {
    public static void main(String[] args) {
        double[][] notasAlunos= new double[4][4];
        
        notasAlunos[0][0]=12;
        notasAlunos[0][1]=15.5;
        notasAlunos[0][2]=17;
        notasAlunos[0][3]=5;
        
        notasAlunos[1][0]=0;
        notasAlunos[1][1]=10;
        notasAlunos[1][2]=1;
        notasAlunos[1][3]=7;
        
        notasAlunos[2][0]=18;
        notasAlunos[2][1]=14;
        notasAlunos[2][2]=8;
        notasAlunos[2][3]=19;
        
        notasAlunos[3][0]=2;
        notasAlunos[3][1]=10;
        notasAlunos[3][2]=10;
        notasAlunos[3][3]=0;
        
        for(int i=0; i<notasAlunos.length; i++){
            
            for(int j=0; j<notasAlunos[i].length; j++){
                
                System.out.print(notasAlunos[i][j]+"  ");
            
            }
            System.out.println(" ");   
        }     
        
        
        System.out.println(">>>CALCULANDO A MÉDIA DE CADA ALUNO<<<");
        
        
        for(int i=0; i<notasAlunos.length; i++){
            
            double media;
            double soma=0;
        
            
            for(int j=0; j<notasAlunos[i].length; j++){
                
                soma += notasAlunos[i][j];
            
            } 
            media=soma/4;
            
            if(media>=7){
                System.out.println("A MÉDIA DO ALUNO DA LINHA "+(i+1)+" É "+media+ " E APROVOU");
                    }
            else{
             System.out.println("A MÉDIA DO ALUNO DA LINHA "+(i+1)+" É "+media+ " E REPROVOU");
            }
            
        }     
    }  
}
