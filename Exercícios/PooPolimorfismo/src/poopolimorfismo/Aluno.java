
package poopolimorfismo;
public class Aluno extends Pessoa{
    
    //Atributos
   
    private String curso;
    private double[] notas=new double[4];
   
    //Métoods especiaias

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }
    
    //Metodos
    
    public int calcularMedia(){
     return 0;
    }
    
    public boolean verificarAprovado(){
     return true;
    }
    
    @Override
    public String obterEtiquetaEndereco(){
    
     String s="Endereco do Aluno: ";
      s=s+this.getEndereco();
      return s;
    }
}
