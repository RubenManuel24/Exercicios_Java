
package projectoanimal;
public abstract class Animal {
    //Atributos
    private String nome;
    
    //Métodos especial

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    //Metodos 
    public abstract void EmitirSom();
        
   
}
