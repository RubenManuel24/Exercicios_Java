
package herança;
public class Professor extends Pessoa {
    
    //Atributos
   
    private String departamento;
    private String nomeCurso;
    private double salario;
    
    //Métodos especiais

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    //Médodo
    
    public int CalcularSalarioLiquido(){
     return 0;
    }
    
}
