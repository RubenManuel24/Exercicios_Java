
package aula02;
public class Aula02 {
    public static void main(String[] args) {
        
        Caneta caneta1= new Caneta();
        
        caneta1.modelo="BRAVO";
        caneta1.cor="VERMELHA";
        caneta1.ponta=0.5;
        caneta1.carga=10;
      
        caneta1.status();
        caneta1.tampar();
        caneta1.escrever();
        
        System.out.println(" ");
        
        Caneta caneta2 = new Caneta();
        
        caneta2.modelo="BIC";
        caneta2.cor="VERMELHA";
        caneta2.ponta= 1;
        caneta2.carga=70;
        
        caneta2.status();
        caneta2.destampar();
        caneta2.escrever();
        
    }
    
}
