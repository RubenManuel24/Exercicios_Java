
package exercitandoheranca;
public class Funcionario extends Pessoa {
    //Atributos
    private String setor;
    private boolean trabalhando;
    //Metodo
    public void mudarTrabalho(){
      if(this.getTrabalhando()==true){
      
          this.setTrabalhando(false);
      }
      else{
      
          this.setTrabalhando(true);
      
      }
    }
    
    public void detalhe(){
        System.out.println("=================================================");
        System.out.println("NOME: "+this.getNome());
        System.out.println("IDADE: "+this.getIdade());
        System.out.println("SEXO: "+this.getSexo());
        System.out.println("SETOR: "+this.getSetor());
        System.out.println("TRABALHO: "+this.getTrabalhando());
        System.out.println("=================================================");
    
    }
    //Metodos especiais

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean getTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
    
}
