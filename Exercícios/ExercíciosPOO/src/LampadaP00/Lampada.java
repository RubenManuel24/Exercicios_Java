package LampadaP00;
public class Lampada {
    //Atributos
    private String marca;
    private String tipo;
    private String cor;
    private double tamanho;
    private double potencia;
    private boolean ligada;
    
    //Metodos especiais
    
    public void Lampada(){
    this.ligada=false;
    this.tamanho=10;
    this.potencia=5;
    }
    
    public void setMarca(String a){
     this.marca=a;
    }
    public String getMarca(){
     return this.marca;
    }
    public void setTipo(String b){
     this.tipo=b;
    }
    public String getTipo(){
     return this.tipo;
    }
    public void setCor(String c){
        this.cor=c;
    }
    public String getCor (){
     return this.cor;
    }
    public void setTamanho(double d){
     this.tamanho=d;
    }
    public double getTamanho(){
     return this.tamanho;
    }
    public void setPotencia(double e){
     this.potencia=e;
    }
    public double getPotencia(){
     return this.potencia;
    }
    public void setLigada(boolean f){
     this.ligada=f;
    }
    public boolean getLigada(){
     return this.ligada;
    }
    //Metodos
    
    public void ligarLampada(){
        if(this.getLigada()==false){
           this.setLigada(true);
            System.out.println("******************************************");
            System.out.println("A Lâmpada "+this.getMarca()+" foi \"ligada\" com sucesso ");
            System.out.println("******************************************");       
        }
        else{
            System.out.println("******************************************");
            System.out.println("A Lâmpada "+this.getMarca()+" já está ligada");
        }   System.out.println("******************************************");
        
    
    }
    public void desligarLampada(){
     if(this.getLigada()==true){
      this.setLigada(false);
      System.out.println("********************************+++**********");
         System.out.println("A Lâmpada "+this.getMarca()+" foi \"desligada\" com sucesso");
      System.out.println("**************************************+++****");
     }
     else{
         System.out.println("******************************************");
         System.out.println("A Lâmpada "+this.getMarca()+" já está desligada");
         System.out.println("******************************************");
     }
    }
    
    public void status(){
        System.out.println("__________________________________________________________________");
        System.out.println("MARCA: "+this.getMarca());
        System.out.println("TPO: "+this.getTipo());
        System.out.println("COR: "+this.getCor());
        System.out.println("TAMANHO: "+this.getTamanho()+" Cm");
        System.out.println("POTENCIA: "+this.getPotencia()+" V");
        System.out.println("LIGADA?: "+this.getLigada());
        System.out.println("__________________________________________________________________");
        System.out.println("");
    }
   
}
