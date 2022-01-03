
package contapoo;
public class TesteConta {
    public static void main(String[] args) {
        
        //Conta 1
        Conta c1=new Conta();
        c1.setDono("Ruben Manuel");
        c1.setNumero("191874");
        c1.setChequeEspecial(true);
        c1.setSaldo(500000);
        c1.setLimite(5000000);
        c1.setAberto(true);
        
        
        
        c1.saquearDinheiro(500000);
      
       
        c1.eliminarConta();
        c1.status();
        
       
        
        
    }
            
}
