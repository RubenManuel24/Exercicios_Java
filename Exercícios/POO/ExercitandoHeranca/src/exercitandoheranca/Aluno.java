
package exercitandoheranca;
public class Aluno extends Pessoa {
    //Atributos
    private boolean matricula;
    private String curso;
    //Metodo
    public void cancelarMatricula(){
     if(this.getMatricula()==true){
      this.setMatricula(false);
     }
     else{
         
         System.out.println("JÁ ESTÁ CANCELADA");
     
     }
     
    
    } 
    
    public void detalhe(){
        System.out.println("=================================================");
        System.out.println("NOME: "+this.getNome());
        System.out.println("IDADE: "+this.getIdade());
        System.out.println("SEXO: "+this.getSexo());
        System.out.println("MATRICULA: "+this.getMatricula());
        System.out.println("CURSO: "+this.getCurso());
        System.out.println("=================================================");
    }
    //Metodos especiais

    public boolean getMatricula() {
        return matricula;
    }

    public void setMatricula(boolean matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    
    
}
