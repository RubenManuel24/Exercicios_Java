package exheranca;
public class Professor extends Pessoa {
    //Atributos
    private String especialidade;
    private double salario;
    //Metodo
    public void recebAumento(double a){
      this.setSalario(this.getSalario()+a);
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
