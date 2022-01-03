
package contabanco;
public class Criacao_B {
    public static void main(String[] args) {
        
        ContaBanco c1 = new ContaBanco();
        
        c1.setNuncont(191874);
        c1.setTipo("cc");
        c1.setDono("RUBEN MANUEL");
        c1.setSaldo(0);
        c1.setStatus(true);
        
        c1.bonus();
        
        c1.status();
        
        c1.pagar_Mensal();
         
        c1.depositar(500);
        
        c1.sacar(200);
        
        System.out.println(" \n\n");
        
        ContaBanco c2 = new ContaBanco();
        
        c2.setNuncont(120304);
        c2.setTipo("cp");
        c2.setDono("Ana Manuel");
        c2.setSaldo(0);
        c2.setStatus(false);
        
        c2.bonus();
        
        c2.status();
        
        c2.pagar_Mensal();
        
        c2.depositar(20);
        
        c2.sacar(20);
        
        
    }
    
}
