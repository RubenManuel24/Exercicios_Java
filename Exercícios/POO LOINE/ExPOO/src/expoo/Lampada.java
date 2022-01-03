
package expoo;
public class Lampada {
    
    private String marca;
    private  String tipo;
    private String cor;
    private int potencia;
    private double tamanho;
    private boolean ligada;

    public Lampada() {
        this.ligada = false;
    }
    //Atributo

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public boolean getLigada() {
        return ligada;
    }

    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }
   
    public void ligarLampada(){
        if(this.ligada==false){
            this.ligada=true;
            System.out.println("A LÂMPADA FOI LIGADA COM SUCESSO");
            System.out.println("====================================");
        }
        else{
            System.out.println("A LÂMPADA JÁ ESTÁ LIGADA");
            System.out.println("====================================");
        }
    }
    
    public void desligarLampada(){
        if(this.ligada==true){
          this.ligada=false;
            System.out.println("A LÃMPADA FOI DELIGADA COM SUCESSO");
            System.out.println("====================================");
        }
        else{
            System.out.println("A LÂMPADA JÁ ESTÁ DESLIGADA");
            System.out.println("====================================");
        }
    }
    public void status(){
        System.out.println("MARCA: "+this.getMarca());
        System.out.println("TIPO: "+this.getTipo());
        System.out.println("COR: "+this.getCor());
        System.out.println("POTENCIA: "+this.getTamanho());
        System.out.println("ESTÁ LIGADA?: "+this.getLigada());
        System.out.println("===================================================");
    }
}
