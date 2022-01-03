
package aula02;
public class Caneta {
    String modelo;
    String cor;
    double ponta;
    int carga;
    boolean tampada;
    
    void status(){
    
         System.out.println("O SEU MODELO É: "+this.modelo);
         System.out.println("UMA CANETA "+this.cor);
         System.out.println("A SUA PONTA É: "+this.ponta);
         System.out.println("A SUA CARGA E DE: " +this.carga);
         System.out.println("ELA ESTA TAMPADA? \n: "+this.tampada);
       
        
    }
    
    void escrever(){
        
        if(this.tampada==false){
            System.out.println("POSSO ESCREVER ESCREVER");
        }
        
        else{
            
            System.out.println("NÃO POSSO ESCREVER");
        }
    
    }
    
    void tampar(){
        
        this.tampada=true;
    }
    
    void destampar(){
    
        this.tampada=false;
    }
    
    
}
