
package exercicios_02;
public class Pessoa {
    
    //Atributos
    
    private String nome;
    private int idade;
    private String sexo;
    
    //Metodo especiais

    public Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }
    

    public String getNome() {
        return nome;
    }

    public void setNome(String a) {
        this.nome = a;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int b) {
        this.idade = b;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String c) {
        this.sexo = c;
    }
    
   // Metodos
    
    
    public void fazerAniversário(){
        
       this.setIdade(this.getIdade()+1);
    }
    
}
