
package contabanco2;

public class Cria_Conta1 {
    public static void main(String[] args) {
        
        ContaBanco2 c1= new ContaBanco2();
        c1.setNumconta(12234);
        c1.setTipo("cc");
        c1.setDono("RUBEN MANUEL");
        c1.setSaldo(200);
        c1.setStatus(false);
        
        c1.depositar(10); 
        c1.pagarMensal();
        c1.sacar(500);
        c1.status();
        
        System.out.println("\n");
        
        
        ContaBanco2 c2= new ContaBanco2();
        c2.setNumconta(12234);
        c2.setTipo("cp");
        c2.setDono("MARIA MADALENA");
        c2.setSaldo(500);
        c2.setStatus(true);
        
        c2.depositar(0); 
        c2.pagarMensal();
        c2.sacar(480);
        c2.status();
        c2.fecharConta();
        
    }
    
}
