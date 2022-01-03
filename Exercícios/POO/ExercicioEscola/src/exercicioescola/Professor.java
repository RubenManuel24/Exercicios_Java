
package exercicioescola;
public final class Professor extends Pessoa {
    //Atributos
    private String especialidade;
    private double salario;
    //Metodo
    
    public void detalhesPr(){
        System.out.println("ESPECIALIDADE: "+this.getEspecialidade());
        System.out.println("SALÁRIO: "+this.getSalario()+ " MIL Kz");
        System.out.println("\n\n");
    
    }
    public void receberAumento(int a){
    
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
