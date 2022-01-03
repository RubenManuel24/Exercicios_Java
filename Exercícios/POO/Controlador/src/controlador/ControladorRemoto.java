
package controlador;
public class ControladorRemoto implements Controlador {
    
    //Aibutos
    
    private boolean ligado;
    private boolean travado;
    private boolean buzina;
    private int aceleracao;
    
    //Métodos especiais
    
    public void Construct(){
     this.ligado=false;
     this.buzina=false;
     this.travado=true;
     this.aceleracao=0;
     
    }
    
    private void setligado(boolean a){
      this.ligado=a;
    }
    private boolean getligado(){
      return this.ligado;
    }
    
    private void settravado(boolean b){
      this.travado=b;
    }
    private boolean gettravado(){
      return this.travado;
    }
    
    public void setBuzina(boolean c) {
        this.buzina = c;
    }
    public boolean getBuzina() {
        return buzina;
    }
    
    private void setaceleracao(int d){
      this.aceleracao=d;
    
    }
    private int getaceleracao(){
      return this.aceleracao;
       
    }
    
    
    // Métodos abstractos
    
    @Override
    public void ligarMenu() {
        System.out.println("-----------MENU----------");
        System.out.println("ESTÁ LIGADO? : "+this.getligado());
        System.out.println("ESTÁ A BUZINAR? : "+this.getBuzina());
        System.out.println("ESTÁ TRAVADO? : "+this.gettravado());
        System.out.println("A ACELERAÇÃO É DE: "+this.getaceleracao()+ "Km/h");
        
    }

    @Override
    public void desligarMenu() {
        System.out.println("MENU DESLIGADO");
    }
    
    @Override
    public void ligar() {
        this.setligado(true);
    }

    @Override
    public void desligar() {
        this.setligado(false);
    }

    @Override
    public void buzinar() {
       this.setBuzina(true);
    }

    @Override
    public void acelerar() {
        if(this.getligado()==true){
          this.setaceleracao(this.getaceleracao()+10);
        
        }
        else{
        
            System.out.println("IMPOSSÍVEL ACELERAR UM CARRO DESLIGADO");
        }
    }

    @Override
    public void travar() {
        if(this.getligado()==true){
            
            if(this.getaceleracao()>0){
                
                this.setaceleracao(this.getaceleracao()-this.getaceleracao());
            
                this.settravado(true);
            }
            else if (this.getaceleracao()==0){
               
                System.out.println("O CARRO JÁ ESTÁ TRAVADO");
        
            }
       
        }
        
        else{ System.out.println("IMPOSSÍVEL TRAVAR UM CARRO DESLIGADO");
        
        }
    }

    
    
    
}
