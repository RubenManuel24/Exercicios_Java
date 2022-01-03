
package projectoanimal;
public final class Cachorro extends Mamifero  {
    //Atributos
    private String tamanho;
    public String raca;
    //Metodos especiais

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
    
    
    //Metodos

    @Override
    public void amamentar() {
        System.out.println("AMAMENDA LEITE");
       
    }

    @Override
    public void EmitirSom() {
        System.out.println("YU YU YU");
    }

    
     
    
}
