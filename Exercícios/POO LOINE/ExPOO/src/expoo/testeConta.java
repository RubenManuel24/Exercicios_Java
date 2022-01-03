
package expoo;
public class testeConta {
    public static void main(String[] args) {
        
         Conta c1 = new Conta();
         c1.setNome("RUBEN MANUEL");
         c1.setNumero(191874);
         c1.setSaldo(500000);
         c1.setEspecial(true);
         c1.setLimite(1000000);
         c1.setAberta(true);
         
         
         //c1.depositarDinheiro(2000000);
         c1.sacarSaldo(500000);
         //c1.consultarSaldo();
         c1.eliminarConta();
         
         
         
         c1.status();
         
         
         Conta c2 = new Conta();
         c2.setNome("SÍLVIA MUTO");
         c2.setNumero(201212);
         c2.setSaldo(300000);
         c2.setEspecial(false);
         c2.setLimite(500000);
         c2.setAberta(true);
         
         
         
         
         c2.depositarDinheiro(10000);
         c2.sacarSaldo(300000);
         c2.consultarSaldo();
         c2.eliminarConta();
         
         c2.status();
         
    }
   
    
    
    
}
