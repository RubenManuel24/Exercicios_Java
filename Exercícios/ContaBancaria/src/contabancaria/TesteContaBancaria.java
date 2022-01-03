
package contabancaria;

import java.util.Calendar;

public class TesteContaBancaria {
    public static void main(String[] args) {
        
        System.out.println("\t*****TESTE DA CONTA BANCARIA SÍMPLES*****");
        System.out.println("\n");
        ContaBancaria conta1 = new ContaBancaria();
        
        conta1.setNomeCliente("RUBEN MANUEL");
        conta1.setNumCliente(123456);
        conta1.setSaldo(1000000);
        conta1.depositarDinheiro(1000000);
        conta1.sacarDinheiro(1000000);
        System.out.println(conta1.toString());
        
        System.out.println("\n");
        System.out.println("\t*****TESTE DA CONTA BANCARIA POUPANÇA*****");
        System.out.println("\n");
        ContaPoupanca contaP = new ContaPoupanca();
        
        contaP.setNomeCliente("Sílvia Muto");
        contaP.setNumCliente(12111314);
        contaP.setSaldo(500);
        contaP.setDiaRendimento(29);
        contaP.depositarDinheiro(500);
        contaP.sacarDinheiro(100);
        contaP.calcularNovoSaldo(0.5);
        System.out.println(contaP.toString());
        
        System.out.println("\n");
        System.out.println("\t*****TESTE DA CONTA BANCARIA ESPECIAL*****");
        System.out.println("\n");
        
        ContaEspecial contaE = new ContaEspecial ();
        
        contaE.setNomeCliente("Bráulio Manuel");
        contaE.setNumCliente(654321);
        contaE.setSaldo(100000);
        contaE.setLimite(200000);
        contaE.depositarDinheiro(1000);
        contaE.sacarDinheiro(500000);
        System.out.println(contaE.toString());
    }
    
}
