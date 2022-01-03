
package ultraemojicombate;

import java.util.Random;

public class Luta {
    
    // Areibutos
    
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovado;
    
    // Métodos
    
    public void marcarLuta(Lutador L1, Lutador L2){
     
        if(L1.getCategoria().equals(L2.getCategoria()) && L1 != L2 ){
             this.aprovado=true;
             this.desafiado=L1;
             this.desafiante=L2;
        }
        
        else{
             
            this.aprovado=false;
            this.desafiado=null;
            this.desafiante=null;
           
        }
    }
    
    public void lutar(){
        
        if(this.aprovado=true){
           System.out.println("####DESAFIADO####");
           this.desafiado.apresentar();
            System.out.println("---------------------------------------");
            System.out.println("####DESAFIANTE####");
           this.desafiante.apresentar();
           
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            System.out.println("===================RESULTADO DA LUTA=========================");
            switch(vencedor){
               
                case 0:
                    System.out.println("EMPATOU!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                    
                case 1:
                    System.out.println("O DESAFIADO "+this.desafiado.getNome()+ " VENCEU A LUTA");
                    this.desafiado.getVitoria();
                    this.desafiante.getDerrota();
                    
                case 2:
                    System.out.println("O DESAFIANTE "+this.desafiante.getNome()+ " VENCEU A LUTA");
                    this.desafiante.getVitoria();
                    this.desafiado.getDerrota();
            
            }
          
            
        }
        
        else{
        
            System.out.println("A LUTA NÃO PODE ACONTECER");
           
        }
        System.out.println("=====================================");
    
    }
    
    // Metodos especiais

    public Lutador getDasafiado() {
        return desafiado;
    }

    public void setDasafiado(Lutador dasafiado) {
        this.desafiado = dasafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }
    
}
