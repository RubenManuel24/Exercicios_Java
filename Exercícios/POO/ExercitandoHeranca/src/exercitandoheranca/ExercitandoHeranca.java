
package exercitandoheranca;
public class ExercitandoHeranca {
    public static void main(String[] args) {
        
        Prof P1 = new Prof();
        Aluno A1 = new Aluno();
        Funcionario F1 = new Funcionario();
        
        
        //Professor
        P1.setNome("ANTONIO MARCOS");
        P1.setIdade(43);
        P1.setSexo("M");
        P1.setEspecialidade("ENGENHARIA INFORMÁTICA");
        P1.setSalario(250);
        P1.fazerAniversario();
        P1.receberAumento(50);
        P1.detalhe();
        
        //Aluno
        A1.setNome("RUBEN MANUEL");
        A1.setIdade(24);
        A1.setSexo("M");
        A1.setMatricula(true);
        A1.setCurso("ENGENHARIA INFORMÁTICA");
        A1.fazerAniversario();
        A1.cancelarMatricula();
        A1.detalhe();
       
        
        //Funcionario
        F1.setNome("MARIA PAULO");
        F1.setIdade(34);
        F1.setSexo("F");
        F1.setSetor("HIGIENE");
        F1.setTrabalhando(true);
        F1.fazerAniversario();
        F1.mudarTrabalho();
        F1.detalhe();
        
        
        
        
    }
    
}
