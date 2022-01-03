
package exercitandoheranca;
public class Prof extends Pessoa{
    //Atributos
    
    private String especialidade;
    private double salario;
    
    //Metodo
    public void receberAumento(double a){
      this.setSalario(this.getSalario()+a);
    
    }
    
    public void detalhe(){
        System.out.println("=================================================");
        System.out.println("NOME: "+this.getNome());
        System.out.println("IDADE: "+this.getIdade());
        System.out.println("SEXO: "+this.getSexo());
        System.out.println("ESPECIALIDAE: "+this.getEspecialidade());
        System.out.println("SALARIO :"+this.getSalario()+" MIL Kz");
        System.out.println("=================================================");
    
    }
    
    //Metodos especiais

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
}
