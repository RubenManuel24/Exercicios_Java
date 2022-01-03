
package exercio1;
public class Arvore {
    
    String nome;
    double tamanho;
    boolean fruto;
    boolean flor;
    
    void status(){
        
        System.out.println("O SEU NOME É: "+this.nome);
        System.out.println("O SEU TAMANHO É: "+this.tamanho);
        System.out.println("ELA DÁ FRUTO?\n:"+this.fruto);
        System.out.println("ELA DÁ FLOR?\n:"+this.flor);
    
    }
    
    
    void Dar_fruto(){
    
        if(this.fruto==true){
        
            System.out.println("O SEU FRUTO É DELICIOSO");
        
        }
        
        else{ System.out.println("A ÁRVORE NÃO DÁ FRUTO");
        }
        
        
    }
    
    void Dar_flor(){
        
        if(this.flor==true){
        
            System.out.println("A SUA FLOR É LINDA");
        
        }
        
        else{
            
            System.out.println("A ÁRVORE NÃO DÁ FLOR");
        }
    }
    
}
