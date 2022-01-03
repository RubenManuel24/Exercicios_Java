
package zoo;
public abstract class Animal {
    //Atributos
    private String nome;
    private double comprimento;
    private int numeroPatas;
    private String cor;
    private String ambiente;
    private int velocidade;
    //Métodos especiais

    public Animal() {
        this.numeroPatas =4;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public int getNumeroPatas() {
        return numeroPatas;
    }

    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    @Override
    public String toString() {
        
        String s ="__________________________________________________________________";
        s+= "\n Nome: "+this.getNome();
        s+= "\n Comprimento: "+this.getComprimento()+" cm";
        s+="\n Número de patas: "+this.getNumeroPatas();
        s+="\n Cor: "+this.getCor();
        s+="\n Ambiente: "+this.getAmbiente();
        s+="\n Velocidade: "+this.getVelocidade()+" m/s";       
        return s;
    }
}
