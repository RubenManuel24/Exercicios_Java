
package classabstract;
public abstract class Pessoa {
    
    //Atributos
    
    private String nome;
    private String endereco;
    private String telefone;
    private String cpf;
    private String sexo;
    
    //Métodos especiais

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    
    public void presencia(){
    
    }
    
    public String obterEtiquetaEndereco(){
    
     return endereco;
    }
    
}
