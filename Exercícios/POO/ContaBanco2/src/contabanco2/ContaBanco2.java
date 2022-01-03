
package contabanco2;
public class ContaBanco2 {
    //Atributos
    
    public int numconta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;
    
    //Metodos personalizados
    
    public void status(){
        System.out.println("-------------------------------------------------");
        System.out.println("O NÚMERO DA CONTA É: "+this.getNumconta());
        System.out.println("A CONTA É DO TIPO: "+this.getTipo());
        System.out.println("O DONO DA CONTA É: "+this.getDono());
        System.out.println("O SALDO DA CONTA É DE: "+this.getSaldo());
        System.out.println("O STATUS DA CONTA É: "+this.getStatus());
    
    }
    
    public void abrirConta(String a){
        
        this.setTipo("a");
        this.setStatus(true);
        
        if(a=="cc"){
        
            this.saldo=50;
        }
        else if(a=="cp"){
            
            this.saldo=150;
        }
        
        System.out.println("CONTA ABERTA COM SUCESSO");
    
    }
    public void fecharConta(){
        
        if(this.getSaldo()>0){
        
            System.out.println("~NÃO PODEMOS FECHAR A CONTA PORQUE TEM DINHEIRO");
        }
        else if(this.getSaldo()<0){
        
            System.out.println("A CONTA ESTÁ EM DÉBITO NÃO PODEMOS FECHAR");
        }
        
        else{
        
             this.setStatus(false);
            System.out.println("CONTA ELIMINADA");
        }
    
    }
    public void depositar(double b){
        
       if(this.getStatus()==true){
       this.setSaldo(this.getSaldo()+b);
        
        System.out.println("DEPOSITO COM SUCESSO"); 
       }
       else{
          
           System.out.println("NÃO PODEMOS FAZER DEPÓSITO NUMA CONTA FECHADA");
       
       }
    }
    public void sacar(double f){
        
        if(this.getStatus()==true){
        
            if(this.getSaldo()<f){
              
                System.out.println("IMPOSSÍVEL SACAR UM VALOR");
                
            }
            else{
                   this.setSaldo(this.getSaldo()-f);
                System.out.println("SAQUE FEITO COM SUCESSO ");
            }
        }
        
        else{
        
            System.out.println("IMPOSSÍVEL SACAR DINHEIRO DE UMA CONTA FECHADA");
        }
        
        
    }
    public void pagarMensal(){
        int v=0;
        if(this.getTipo()=="cc"){
        v=12;
        }
        else if(this.getTipo()=="cp"){
        v=20;
        }
        
        if(this.getStatus()==true){
            
            if(this.getSaldo()>v){
                
         this.setSaldo(this.getSaldo()-v);
            System.out.println("MENSALIDADE PAGA COM SUCESSO");
            
            }
            else{
                
                System.out.println("SALDO DA CONTA É INSUFICIENTE PARA PAGAR A MENSALIDADE");
            
            }
            
        }
        else{
        
            System.out.println("IMPOSSÍVEL PAGAR MENSALIDADE SE A CONTA ESTÁ FECHADA");}
    
    }
    
    
    
    //Metodos especiais

    public ContaBanco2() {
        
        this.saldo=0;
        this.status=false;
        
    }

    public int getNumconta() {
        return numconta;
    }

    public void setNumconta(int numconta) {
        this.numconta = numconta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    void setdepositar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void abrirConta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
