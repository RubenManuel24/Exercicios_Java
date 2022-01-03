
package exheranca;
public class ExHeranca {
    public static void main(String[] args) {
        
        Pessoa p1=new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4= new Funcionario();
        
        p1.setNome("RUBEN MANUEL");
        p2.setNome("ANA MARIA");
        p3.setNome("João Mario");
        p4.setNome("BENTO PAULO");
        
        p2.setCurso("E. INFORMÁTICA");
        
        
        p3.setSalario(200);
        
        System.out.println(p3.toString());
        System.out.println(p1.toString());
        
        
    }
    
}
