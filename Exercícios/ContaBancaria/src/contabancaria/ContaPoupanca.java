
package contabancaria;

import java.util.Calendar;

public final class ContaPoupanca extends ContaBancaria {
    //Atributo
    private int diaRendimento;
    //Metodo especial

    public int getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(int diaRendimento) {
        this.diaRendimento = diaRendimento;
    }
    //Metodo
    public void calcularNovoSaldo(double taxaRendimento){
     Calendar hoje = Calendar.getInstance();
     
     if(diaRendimento == hoje.get(Calendar.DAY_OF_MONTH)){
      this.setSaldo(this.getSaldo()+(this.getSaldo()*taxaRendimento));
        System.out.println("------------------------------------------------------------------");
        System.out.println("O novo saldo é de: "+this.getSaldo()+" Kz");
        System.out.println("------------------------------------------------------------------");
     }
     else{
       System.out.println("------------------------------------------------------------------");
         System.out.println("Hoje não é o dia da taxa de rendimento");
         System.out.println("------------------------------------------------------------------");
               
     }
    
    }

    @Override
    public String toString() {
        String s = super.toString();
               s+="\nDia rendimento: "+this.diaRendimento;
               s+="\n________________________________________________________";
               return s;
    }
    
}
