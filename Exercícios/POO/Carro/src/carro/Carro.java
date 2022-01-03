
package carro;
public class Carro {
    
    private String marca;
    private String cor;
    private String matricula;
    private String potencia;
    private int kilometragem;
    private int ano_fabrico;
    private int velocidade;
    private int gasolina;
    private boolean ligado;
    private String vidro;
    
    
    public Carro(){
    
      vidro="FUMADO";
    
    }
    
    public void setMarca(String a){
      this.marca=a;
    }
    public String getMarca(){
      return this.marca;
    }
    
    public void setCor(String b){
      this.cor=b;
    }
    public String getCor(){
      return this.cor;
    }
    
    public  void setMatricula(String c){
      this.matricula=c;
    }
    public String getMatricula(){
      return this.matricula;
    }
    
    public void setPotencia(String d){
      this.potencia=d;
    }
    public String getPotencia(){
      return this.potencia;
    }
    
    public void setKilometragem(int e){
      this.kilometragem=e;
    }
    public int getKilometragem(){
      return this.kilometragem;
    }
    
    public void setAno_fabrico(int f){
      this.ano_fabrico=f;
    }
    public int getAno_fabrico(){
     return this.ano_fabrico;
    }
    
    public void setVelocidade(int g){
     this.velocidade=g;
    }
    public int getVelocidade(){
     return this.velocidade;
    }
    
    public void setGasolina(int h){
     this.gasolina=h;
    }
    public int getGasolina(){
     return this.gasolina;
    }
    
    public void setLigado(boolean i){
      this.ligado=i;
    }
    public boolean getLiagdo(){
      return this.ligado;
    }
    
    
    public void estado_car(){
    
        if(this.velocidade==0 && this.gasolina==0 && this.ligado==false){
        
            System.out.println("O CARRO ESTÁ DESLIGADO");
        }
        else if(this.velocidade>0 && this.gasolina>0 && this.ligado==true){
        
            System.out.println("O CARRO ESTÁ LIGADO");
        }
        
        else if(this.velocidade==0 && this.gasolina>0 && this.ligado==true){
        
            System.out.println("O CARRO ESTÁ LIGADO");
        
        }
        
        else {
        
            System.out.println("O CARRO ESTÁ DESLIGADO");
        }
    }
    
    public void no_ou_anti(){
    
           if(this.ano_fabrico==2021){
             
               System.out.println("O CARRO É DE FABRICO NOVO");
           }
           else if(this.ano_fabrico<2021 && this.ano_fabrico>=2018){
           
           
               System.out.println("O CARRO É RECENTE");
               
           }
           
           else if(this.ano_fabrico<2018){
           
               System.out.println("O CARRO É ANTIGO");
           
           }
           
           else{
           
               System.out.println("Erro no ano do fabrico"); 
           }
    
    }
    
    public void status(){
    
           System.out.println("A MARCA DO CARRO É: "+this.marca);
           System.out.println("A COR DO CARRO É: "+this.cor);
           System.out.println("A MATRICULA DO CARRO É: "+this.matricula);
           System.out.println("A POTENCIA DO CARRO É DE: "+this.potencia+" N/ms2");
           System.out.println("A KILOMETRAGEM DO CARRO É DE: "+this.kilometragem+" Km/h");
           System.out.println("O ANO DE FABRICO É DE: "+this.ano_fabrico);
           System.out.println("A VELOCIDADE DO CARRO É DE: "+this.velocidade+" m/s2");
           System.out.println("A QUANTIDADE DE GASOLINA É DE: "+this.gasolina+" L");
           System.out.println("O VIDRO É: "+this.vidro);
           
    
    }   
    
}

    
    
    

