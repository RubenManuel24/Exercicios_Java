
package projetosLivros;
public class Pessoa {
    
    // Atributos 
    
    private String nome;
    private int idade;
    private char sexo; 
    
    // Métodos
    
    public void fazerAniversario(){
    
       this.idade++;
    
    }
    
    //Métodos especiais

    public Pessoa(String nome, int idade, char sexo) {
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

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char c) {
        this.sexo = c;
    }
    
    
}
