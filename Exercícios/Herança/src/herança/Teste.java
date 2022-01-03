
package herança;
public class Teste {
    public static void main(String[] args) {
        
        Aluno aluno1 = new Aluno();
        Professor prof1 = new Professor();
        
        //Aluno
        aluno1.setNome("Dádiva");
        aluno1.setEndereco("Rua da Enana");
        aluno1.setTelefone("937692714");
        aluno1.setCpf("99999999");
        aluno1.setCurso("EI");
        aluno1.setSexo("Masculino");
        
        aluno1.verificarAprovado();
        aluno1.calcularMedia();
        aluno1.presencia();
        
        
        //Professor
        prof1.setNome("Pedro");
        prof1.setEndereco("Rocha");
        prof1.setCpf("2999");
        prof1.setTelefone("203303030");
        prof1.setSalario(212212);
        prof1.setDepartamento("Eng");
        prof1.setNomeCurso("EI");
        prof1.setSexo("Sexo");
        
        prof1.CalcularSalarioLiquido();
        prof1.presencia();
        
        
    }    
}
