
package pessoaescola;
public abstract class Pessoa {
    //Atributos
    protected String nome;
    protected int idade;
    protected String sexo;
    //Metodo
    public void fazerAniversario(){
        
        this.setIdade(this.getIdade()+1);
         }
    
    public void detalhesP(){
        System.out.println("====================================");
        System.out.println("NOME: "+this.getNome());
        System.out.println("IDADE: "+this.idade);
        System.out.println("SEXO: "+this.sexo);
       
    }
    //Metodo especiais

    
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
