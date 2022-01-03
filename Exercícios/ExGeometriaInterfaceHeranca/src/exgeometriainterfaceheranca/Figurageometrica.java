
package exgeometriainterfaceheranca;
public class Figurageometrica {
    //Atributos
    private String nome;
    private String cor;
    //Metodos especiais

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        
         String s="\nNome: "+this.getNome();
                s+="\nCor: "+this.getCor();
         return s;
    }
    
    
}
