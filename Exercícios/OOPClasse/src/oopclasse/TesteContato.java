
package oopclasse;
public class TesteContato {
    public static void main(String[] args) {
        
        Contato contato = new Contato();
        
        contato.setNome("Tyrion");
        contato.setEndereco("Kings Landing");
        contato.setTelefone("11 99999-9999");
        
        //criar objeto endereço
        
        Endereco end = new Endereco();
        end.setNomeRua("Rua Game of Thrones");
        end.setNumero("n/a");
        end.setComplemento("___"); 
        end.setCidade("Kings Landing");
        end.setEstado("Westeros");
        end.setCep("999999");
        
        contato.setEndereco(end);
        
        System.out.println(contato.getNome());
        System.out.println(contato.getEndereco());
        System.out.println(contato.getTelefone());
        
        
        
    }
}
