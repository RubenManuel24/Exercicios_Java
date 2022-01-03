
package aula02;
public class Aula02 {
    public static void main(String[] args) {
        Caneta caneta1= new Caneta();
        caneta1.modelo="BRAVO";
        caneta1.cor="AZUL";
       // caneta1.ponta=0.4;
        caneta1.carga=23;
        //caneta1.tampada=false;
        caneta1.status();
        
        caneta1.tampar();
        
        
        caneta1.escrever();
        
        
    }
    
}
