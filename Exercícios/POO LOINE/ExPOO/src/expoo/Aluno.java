
package expoo;
public class Aluno {
    
    //Atributos
    String nome;
    String matricula;
    String curso;
    String[] nomeDisciplinas= new String[3];
    double[][] notasDisciplinas= new double[3][4];
    //Métodos especiais

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String[] getNomeDisciplinas() {
        return nomeDisciplinas;
    }

    public void setNomeDisciplinas(String[] nomeDisciplinas) {
        this.nomeDisciplinas = nomeDisciplinas;
    }

    public double[][] getNotasDisciplinas() {
        return notasDisciplinas;
    }

    public void setNotasDisciplinas(double[][] notasDisciplinas) {
        this.notasDisciplinas = notasDisciplinas;
    }
    
    //Metodos
    
    void mostrarInfo(){
        System.out.println("NOME: "+this.getNome());
        System.out.println("MATRICULA: "+this.getMatricula());
        System.out.println("NOME DO CURSO: "+this.getCurso());
        
        for(int i=0; i<this.getNotasDisciplinas().length; i++){
            System.out.println("MOSTRAR NOTAS DA DISCIPLÍNA "+this.getNomeDisciplinas()+" :");
           for(int j=0; j<this.getNotasDisciplinas()[i].length; j++){
               System.out.println((j+1)+" NOTA: "+this.getNotasDisciplinas()[i][j]+" ");
           
           }
            System.out.println(" \n ");
        }
    
    }
    
}
