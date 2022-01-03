
package poo;
public class OcontatoAgenda {
    public static void main(String[] args) {
        
        ContatoAgenda cg1 = new ContatoAgenda();
        
        cg1.nomes="JOÃO EBO";
        cg1.emails="joaoebo@gemail.com";
        cg1.enderecos="BAIRRO ZONA VERDE, RUA CHORRASQUEIRA, CASA Nº 50";
        cg1.telefones="945673032";
        
        System.out.println("NOME: "+cg1.nomes);
        System.out.println("EMAIL: "+cg1.emails);
        System.out.println("ENDEREÇOS: "+cg1.enderecos);
        System.out.println("TELEFONE: "+cg1.telefones);
    }
            
}
