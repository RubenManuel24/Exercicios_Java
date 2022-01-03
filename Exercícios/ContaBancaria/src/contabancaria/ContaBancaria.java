
package contabancaria;
public class ContaBancaria {
    //Atributos
    private String nomeCliente;
    private int numCliente;
    private double saldo;
    //Metodo especiais

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getNumCliente() {
        return numCliente;
    }

    public void setNumCliente(int numCliente) {
        this.numCliente = numCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    //Metodos
    public void sacarDinheiro(double sacar){
     if(sacar<=this.getSaldo()){
         this.setSaldo(this.getSaldo()-sacar);
         System.out.println("Foi sacado :"+sacar+" Kz"); 
     }
     else{
         System.out.println("------------------------------------------------------------------");
         System.out.println("Impossível sacar porque o dinheiro a sacar é  maior que o saldo");
         System.out.println("------------------------------------------------------------------");
     }
    
    }
    public void depositarDinheiro(double depositar){
        this.setSaldo(this.saldo+depositar);
          System.out.println("--------------------------------------------");
        System.out.println("Foi depositado :"+depositar+" Kz");
          System.out.println("--------------------------------------------");
    }

    @Override
    public String toString() {
         String s ="________________________________________________________";
               s+="\nNome: "+this.getNomeCliente();
               s+="\nNúmero: "+this.getNumCliente();
               s+="\nSaldo: "+this.getSaldo()+ " Kz";
        return s;
    }
    
    
}

