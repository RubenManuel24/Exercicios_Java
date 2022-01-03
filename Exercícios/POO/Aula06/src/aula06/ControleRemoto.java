
package aula06;
public class ControleRemoto implements Controlador  {
    //Atributos
    
    private int volume;
    private boolean ligado;
    private boolean tocando;

    // Método construtor

    public ControleRemoto() {
        this.volume = 0;
        this.ligado = false;
        this.tocando = false;
    }
    //Método acessor e modificador

   private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

   private boolean getLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean getTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    // Métodos abstractos

    @Override
    public void ligar() {
        
        this.setLigado(true);
        
    }

    @Override
    public void desligar() {
        
        this.setLigado(false);
        
    }

    @Override
    public void abrirMenu() {
        
        System.out.println("--------MENU--------");
        
        System.out.println("ESTÁ LIGADO? " + this.getLigado() );
        System.out.println("ESTÁ TOCANDO? " + this.getTocando());
        System.out.print("VOLUME: " + this.getVolume());
        for(int a=0; a<this.getVolume(); a+=10){
        
            System.out.print(" = ");
        }
        
    }

    @Override
    public void fecharMenu() {
        
        System.out.println("FECHAR MENU");
    }

    @Override
    public void maisVolume() {
        
        if(this.getLigado()==true){
           
            this.setVolume(this.getVolume()+10);
        
        }
        else{
        
            System.out.println("IMPOSSÍVEL AUMENTAR O VOLUME NUMA TV OFF");
        }
    }

    @Override
    public void menosVolume() {
        if(this.getLigado()==true){
        
            this.setVolume(this.getVolume()-10);
        
        }
        else{
        
            System.out.println("IMPOSSÍVEL BAIXAR VOLUME NUMA TV OFF");
        }
    }

    @Override
    public void ligarMudo() {
        
      if(this.getLigado()==true && this.volume>0){
          
          this.setVolume(0);
      
      }  
        
    }

    @Override
    public void desligarMudo() {
        
        if(this.getLigado()==true && this.getVolume()==0){
           
            this.setVolume(50);
        
        }
        
    }

    

    @Override
    public void pause() {
        
        if(this.getLigado()==true && this.getTocando()==true){
        
           this.setTocando(false);
        }
        
    }
    
    @Override
    public void play() {
        
        if(this.getLigado()==true && this.getTocando()==false){
        
           this.setTocando(true);
            
        }
        
    }
  
}
  
