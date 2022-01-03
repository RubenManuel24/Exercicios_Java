
package contabanco;
public class ContaBanco {
   
        private long nuncont;
        protected String tipo;
        private String dono;
        private double saldo;
        private boolean status;
        private double saldoBonus;
        
        //Métodos especiais(métodos acessores, modificadores e construtores para dar segurança nos atributos da classe)
        
        public ContaBanco(){
          this.saldo=0;
          this.status=false;
          
        }
        
        public void setNuncont(long a){
           this.nuncont=a;
        }
        public long getNuncont(){
            return this.nuncont;
        }
        
        public void setTipo(String b){
           this.tipo=b;
        }
        public String getTipo(){
           return this.tipo;
        }
        
        public void setDono(String c){
           this.dono=c;
        }
        public String getDono(){
          return this.dono;
        }
        
        public void setSaldo(double d){
          this.saldo=d;
        }
        public double getSaldo(){
          return this.saldo;
        }
        
        public void setStatus(boolean e){
           this.status=e;
        }
        public boolean getStatus(){
           return this.status;
        }
        
        
        // Métodos normais que difiniram os comportamentos das contas
        

         public void bonus(){
             
           if(this.tipo=="cc"){
           
             this.saldoBonus=50;
             this.saldo=this.saldo+this.saldoBonus;
           }
           
           else{
            
              this.saldoBonus=150;
               this.saldo=this.saldo+this.saldoBonus; 
           }
         
         }
       
        public void pagar_Mensal(){
            int c=0;
           
          if(this.tipo=="cc"){
          
            c=12;
          }
          
          else if(this.tipo=="cp"){
            c=20;
          
          }
          
          if(this.status==true){
            
              if(this.saldo>c){
                  
                  this.saldo=this.saldo-c;
              
              }
              
              else{
                
                  System.out.println("SALDO INSUFICIENTE");
              
              }
          
          }
          
          else{
          
              System.out.println("IMPOSSÍVEL PAGAR");
              
          }
          
          
        
        }
        
        
        public void depositar(long saldoP){
        
           if(status==true){
             
               this.saldo = this.saldo + saldoP;  
               System.out.println("FOI DEPOSITADO: "+saldoP+" Kz");
               System.out.println("O SALDO NOVO É DE: "+this.saldo);
           }
           else{
           
               System.out.println("IMPOSSÍVEL DEPOSITAR PORQUE A CONTA ESTÁ FECHADA");
           }
        }
        
        
        public void sacar(int  sacarV){
            
            
            if(this.saldo>=sacarV && this.status==true){
            
               this.saldo=this.saldo-sacarV;
                System.out.println("O VALOR SACADO É DE: "+sacarV+" Kz");
                System.out.println("ACTUALMENTE O SALDO É: "+this.saldo);
            }
            else{
            
                System.out.println("IMPOSSÍVEL SACAR DINHEIRO");
            }
        }
        
        
        
        
        public void status(){
        
            System.out.println("O NÚMERO DA CONTA É DE: "+this.nuncont);
            System.out.println("A CONTA É DO TIPO: "+this.tipo);
            System.out.println("O DONO DA CONTA É: "+this.dono);
            System.out.println("O SALDO DA CONTA É DE: "+this.saldo);
            System.out.println("A CONTA ESTÁ BERTA: "+this.status);
           
            
        }
        
       
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
}
