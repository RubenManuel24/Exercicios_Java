
package contapoo;
public class Conta{

    //Atributo
   private String dono;
   private String numero;
   private boolean chequeEspecial;
   private double saldo;
   private double limite;
   private boolean aberto;
   
    //Medotos especiais
   public void Conta(){
    this.saldo=0000;
    this.numero="0000";
    this.limite=1000000;
   }
   
   public void setDono(String a){
    this.dono=a;
   }
   public String getDono (){
    return this.dono;
   }
   public void setNumero(String b){
    this.numero=b;
   }
   public String getNumero(){
    return this.numero;
   }
   public void setChequeEspecial(boolean c){
    this.chequeEspecial=c;
   }
   public boolean getChequeEspecial(){
    return this.chequeEspecial;
   }
   public void setSaldo(double d){
    this.saldo=d;
   }
   public double getSaldo(){
    return this.saldo;
   }
   public void setLimite(double e){
    this.limite=e;
   }
   public double getLimite(){
    return this.limite;
   }
   public void setAberto(boolean f){
     this.aberto=f;
   }
   public boolean getAberto(){
    return this.aberto;
   }
   
   //Metodos
   public void saquearDinheiro(double sacar){
       if(this.getAberto()==true && sacar<=this.getSaldo()){
       this.setSaldo(this.getSaldo()-sacar);
           System.out.println("************************************************************************");
           System.out.println("Saque na conta "+this.getDono()+" com sucesso;\n Valor sacado: "+sacar+" Kz");
           System.out.println("************************************************************************");
       }
       else{
           System.out.println("************************************************************************");
           System.out.println("Impossível fazer o saque na conta "+this.getDono());
           System.out.println("************************************************************************");
       }
   }
   public void depositarDinheiro(double depositar){
       if(this.getAberto()==true && depositar<=this.getLimite()){
        this.setSaldo(this.getSaldo()+depositar);
           System.out.println("************************************************************************");
           System.out.println("Deposito na conta "+this.getDono()+ " feito com sucesso;\n Valor depositado: "+depositar+" Kz");
           System.out.println("************************************************************************");
       }
       else{
           System.out.println("************************************************************************");
           System.out.println("Impossível fazer o depósito na conta "+this.getDono());
           System.out.println("************************************************************************");
           
       }
       
   }
   public void consultarSaldo(){
       if(this.getAberto()==true){
       System.out.println("************************************************************************");
       System.out.println("O saldo na conta "+this.getDono()+" é de: "+this.getSaldo()+" Kz");
       System.out.println("************************************************************************");
       }
       else{
           System.out.println("************************************************************************");
           System.out.println("Impossível consultar o saldo na conta: "+this.getDono());
           System.out.println("************************************************************************");
       }
   }
   public void verificarConta(){
       if(this.getAberto()==true){
       System.out.println("************************************************************************");    
       System.out.println("O teu cheque é especila?: "+this.getChequeEspecial());
       System.out.println("************************************************************************");
       }
       else{
           System.out.println("************************************************************************");
           System.out.println("Impossível verificar a o seu cheque da conta :"+this.getDono());
           System.out.println("************************************************************************");
       }
   }
   public void eliminarConta(){
       if(this.getSaldo()==0){
       this.setDono("   ");
       this.setSaldo(0000);
       this.setNumero("0000");
       this.setLimite(0000);
       this.setAberto(false);
           System.out.println("Conta "+this.getDono()+" foi eliminada com sucesso");
       }
       else{
           System.out.println("Impossível eliminar a conta: "+this.getDono());
       }
   
   }
   public void status(){
   System.out.println("__________________________________________________________________________");
   System.out.println("Dono: "+this.getDono());
   System.out.println("Número: "+this.getNumero());
   System.out.println("Cheque Especial?: "+this.getChequeEspecial());
   System.out.println("Saldo: "+this.getSaldo()+" Kz");
   System.out.println("Limite do valor na conta: "+this.getLimite()+" Kz");
   System.out.println("A conta está aberta?: "+this.getAberto());
   System.out.println("__________________________________________________________________________");
   
   
   }
   
}
