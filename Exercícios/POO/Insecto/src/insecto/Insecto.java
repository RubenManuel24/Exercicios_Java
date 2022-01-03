
package insecto;
public class Insecto {
   
    
    String nome;
    String cor;
    char  genero;
    Double tamanho;
    int N_perna;
    boolean asa; 
    
    void status(){
    
        System.out.println("O NOME DO INSECTO É: "+this.nome);
        System.out.println("A COR DO INSECTO É: "+this.cor);
        System.out.println("O GENERO DO INSECTO É: "+this.genero);
        System.out.println("O TAMANHO DO INSECTO É: "+this.tamanho+"cm");
        System.out.println("O NÚMERO DE PERNA É: "+this.N_perna);
        System.out.println("O INSECTO TEM ASAS?\n "+this.asa);
        
        
    }
    
    
    void voar(){
      
        if(asa==true){
        
            System.out.println("O INSECTO VOA");
            
        }
       
        else{
           
            System.out.println("O INSECTO NÃO VOA");
        }
    }
    
    void correr(){
    
        if(N_perna>0){
        
            System.out.println("O INSECTO CORRE");
        }
        
        else{
        
            System.out.println("O INSECTO NÃO CORRE");
        
        }
    
    }
    
}
