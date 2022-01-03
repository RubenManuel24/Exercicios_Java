
package pessoaescola;
public class Aluno extends Pessoa{
    
    //Atributos
    private int matricula;
    private String curso;
    //Metodo
    public void pagarMensalidade(){
        System.out.println("PAGANDO MENSALIDADE DO/A ALUNO/A "+this.nome);
    }
    
    public void detalheA(){
    
        System.out.println("MATRICULA: "+this.getMatricula());
        System.out.println("CURSO: "+this.getCurso());
        System.out.println("==================================");
    }
    
    //Metodos Especiais

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
}
