
package interfacanimal;
public abstract class Animal {
    // Atributo
    private String nome;
    //Metodos especiais

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    //Metodos 
    public abstract void emitirSom();
    
}
