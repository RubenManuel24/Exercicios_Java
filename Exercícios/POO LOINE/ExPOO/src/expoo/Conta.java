
package expoo;
public class Conta {
    
    //Atributos
   private String nome;
   private int numero;
   private double saldo;
   private boolean especial;
   private double limite;
   private boolean aberta;
    
   //Metodos especiais
    public Conta() {
        this.aberta=false;
        this.saldo = 0;
        this.limite = 1000000;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String a) {
        this.nome = a;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int b) {
        this.numero = b;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double c) {
        this.saldo = c;
    }

    public boolean getEspecial() {
        return especial;
    }

    public void setEspecial(boolean d) {
        this.especial = d;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double e) {
        this.limite = e;
    }

    public boolean getAberta() {
        return aberta;
    }

    public void setAberta(boolean aberta) {
        this.aberta = aberta;
    }
    
    
    //Metodos
    
    public void sacarSaldo(double sacar){
        if(this.getAberta()==true && this.getSaldo()>=sacar){
         
           this.setSaldo(this.getSaldo()-sacar);
            System.out.println(">>SAQUE FEITO COM SUCESSO<<");
            System.out.println("FOI SACADO: "+sacar+" Kz");
            System.out.println("========================================");
        }
        else{
        
            System.out.println("IMPOSSÍVEL FAZER O SAQUE");
            System.out.println("=========================================");
        
        }
    }
    
    public void depositarDinheiro(double depositar){
        if(depositar<this.getLimite() && this.getAberta()==true){
        this.setSaldo(this.getSaldo()+depositar);
            System.out.println("O VALOR DEPOSITADO É DE: "+depositar+" Kz");
            System.out.println("===========================================");
        
        }
        else{
        
            System.out.println("IMPOSSÍVEL FAZER O DEPÓSITO");
            System.out.println("===========================================");
        }
    
    }
    
    public void consultarSaldo(){
    
        System.out.println("O SEU SALDO É DE: "+this.getSaldo()+" Kz");
        System.out.println("================================================");
    }
    
    public void eliminarConta(){
        if(this.getSaldo()==0){
        this.setNome(" ");
        this.setNumero(0000);
        this.setSaldo(0000);
        this.setLimite(0000);
        this.setAberta(false);
            System.out.println("*******************************");
            System.out.println("A CONTA "+this.getNome()+ " FOI ELIMINADA COM SUCESSO");
            System.out.println("*******************************");
        }
        else{
             System.out.println("******************************************************");
            System.out.println("IMPOSSÍVEL ELIMINAR A CONTA "+this.getNome()+" PORQUE AINDA CONTÉM VALOR");
             System.out.println("******************************************************");      
        }
    
    
    }
    
    public void status(){
        System.out.println("_________________________________________________");
        System.out.println("NOME: "+this.getNome());
        System.out.println("NÚMERO: "+this.getNumero());
        System.out.println("SALDO: "+this.getSaldo());
        System.out.println("ESPECIAL?: "+this.getEspecial());
        System.out.println("LIMITE: "+this.getLimite());
        System.out.println("ABERTA?: "+this.getAberta());
        System.out.println("_________________________________________________");
        System.out.println("\n\n");
    }
    
    
    
}
