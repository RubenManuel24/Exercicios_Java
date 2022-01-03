
package aula04;
public class Caneta {
    
    private String modelo;
    private double ponta;
    private boolean tampa;
    private String cor;
    
    public Caneta(String m, String a, double p){
    
     this.tampar();
     this.modelo =m;
     this.cor=a;
     this.ponta=p;
     
     
     
    }
    
    public void setmodelo(String a){ 
        this.modelo=a;
    }
    public String getmodelo(){  
        return this.modelo;
    }
    
    
    
    public void setponta(double b){
       this.ponta=b;
    }
    public double getponta(){
    
        return this.ponta;
    }
    
    public void tampar(){
    
      this.tampa=true;
    }
    
   public void status(){
       
       System.out.println(">>>SOBRE A CANETA<<<");
       System.out.println("O SEU MODELO É: "+ this.modelo);
       System.out.println("A SUA PONTA É: "+ this.ponta);
       System.out.println("A COR É: "+ this.cor);
       System.out.println("ELA ESTAR TAMPADA: "+this.tampa);
   }
}
