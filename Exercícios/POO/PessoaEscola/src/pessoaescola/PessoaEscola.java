
package pessoaescola;
public class PessoaEscola {
    public static void main(String[] args) {
        
       
       //ALUNO
        Aluno a = new Aluno();
        a.setNome("SÍLVIA JUNTU");
        a.setIdade(20);
        a.setSexo("FEMENINO");
        a.setCurso("ANÁLISE CLÍNICA");
        a.setMatricula(12);
        a.fazerAniversario();
        a.pagarMensalidade();
        a.detalhesP();
        a.detalheA();
        //BOLSISA
        
        Bolsista b= new Bolsista();
        b.setNome("JOÃO EBO");
        b.setIdade(24);
        b.setSexo("MASCULINO"); 
        b.setCurso("ENGENHARIA INFORMÁTICA");
        b.setMatricula(23);
        b.fazerAniversario();
        b.pagarMensalidade();
        b.setBolsa(124);
        b.renovarBolsa();
        b.detalhesP();
        b.detalheA();
        b.detalheB();
        
        
                
        
    }
    
}
