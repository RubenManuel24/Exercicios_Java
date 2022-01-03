
package aula02;
public class Caneta {
   public String modelo;
   public String cor;
   private double ponta;
   protected int carga;
   private boolean tampada;
    
    public void status(){
    
         System.out.println("O SEU MODELO É: "+this.modelo);
         System.out.println("UMA CANETA "+this.cor);
         System.out.println("A SUA PONTA É: "+this.ponta);
         System.out.println("A SUA CARGA E DE: " +this.carga);
         System.out.println("ELA ESTA TAMPADA? \n: "+this.tampada);
       
        
    }
    
    public void tampar(){
        
        tampada=true;
    }
    
    
    void destampar(){
    
       tampada=false;
    }
    
    
   public void escrever(){
        
        if(this.tampada==false){
            System.out.println("POSSO ESCREVER ESCREVER");
        }
        
        else{
            
            System.out.println("NÃO POSSO ESCREVER");
        }
    
    }
    
   
    
    
    
}
