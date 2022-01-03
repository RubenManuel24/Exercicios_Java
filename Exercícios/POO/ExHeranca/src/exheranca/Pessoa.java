package exheranca;
public class Pessoa {
    
    //Atributos
    private String nome;
    private int idade;
    private String sexo;
    
    //Método
    
    public void fazerAniversário(){
      
        this.setIdade(this.getIdade()+1);
    }
    
    //Métodos especiais
    public String getNome(){
        return this.nome;
    }
    public void setNome(String a){
       this.nome=a;
    }
    public int getIdade(){
       return this.idade;
    }
    public void setIdade(int b){
       this.idade=b;
    }
    public String getSexo(){
       return this.sexo;
    }
    public void setSexo(String c){
       this.sexo=c;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + '}';
    }
    
}
