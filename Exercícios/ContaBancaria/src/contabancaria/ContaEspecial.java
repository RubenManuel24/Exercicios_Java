
package contabancaria;
public final class ContaEspecial extends ContaBancaria {
    //Atributo
    private double limite;
    //Metodos especiais

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    //Metodo
    @Override
    public void sacarDinheiro(double sacar){
        if(sacar<=this.getSaldo() && sacar<=this.getLimite()){
         this.setSaldo(this.getSaldo()-sacar);
            System.out.println("----------------------------------------------------------");
            System.out.println("Foi sacado : "+sacar+" na conta "+this.getNomeCliente());
            System.out.println("----------------------------------------------------------");
        }
        else{
            System.out.println("----------------------------------------------------------");
            System.out.println("Não foi possivel fazer o saque");
            System.out.println("----------------------------------------------------------");
        }
    
    }

    @Override
    public String toString() {
        String s= super.toString();
               s+="\n Limite da Conta: "+this.getLimite();
               s+="\n________________________________________________________";
               return s;
    }
    
}
