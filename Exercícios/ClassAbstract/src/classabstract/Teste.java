
package classabstract;
public class Teste {
    public static void main(String[] args) {
        
        //Pessoa pe1 = new Pessoa();
        Aluno A1 = new Aluno();
        Professor prof1 = new Professor(); 
        
       // pe1.setEndereco("rua da enana");
        A1.setEndereco("rua benfica patriota");
        prof1.setEndereco("Cantinton");
        
        String a=A1.obterEtiquetaEndereco();
        //String b=pe1.obterEtiquetaEndereco();
        String c=prof1.obterEtiquetaEndereco();
        
        System.out.println(a);
        //System.out.println(b);
        System.out.println(c);
    }
    
}
