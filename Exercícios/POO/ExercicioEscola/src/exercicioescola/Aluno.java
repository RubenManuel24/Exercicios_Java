
package exercicioescola;
public class Aluno extends Pessoa {
    //Atributos
    private int matricula;
    private String curso;
    //Metodo
    
    public void detalheA(){
    
        System.out.println("MATRICULA: "+this.getMatricula());
        System.out.println("CURSO: "+this.getCurso());
        System.out.println(" ");
                
       
    
    }
    public void pagarMensalidade(){
        
        System.out.println("=======================================");
        System.out.println("A MENSALIDADE DO/A ALUNO/A "+this.getNome()+" FOI PAGA");
    }
    //Metodos especiais

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
