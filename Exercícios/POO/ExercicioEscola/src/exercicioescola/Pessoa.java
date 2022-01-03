
package exercicioescola;
public abstract class Pessoa {
    //Atributo
    protected String nome;
    protected int idade;
    protected String sexo;
    //Metodo
    public final void fazerAniversario(){
     this.setIdade(this.getIdade()+1);
    }
    
    public void detalheP(){
        System.out.println("==================================");
        System.out.println("NOME: "+this.getNome());
        System.out.println("IDADE: "+this.getIdade());
        System.out.println("SEXO: "+this.getSexo());
    
    }
    //Metodos especiais

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    
}
