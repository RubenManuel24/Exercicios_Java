
package projectoanimal;
public class TesteAnimal{
    public static void main(String[] args) {
        
       Gato gato1= new Gato();
       
       gato1.setNome("JÚNIO");
       gato1.setRaça("STRONG");
       gato1.EmitirSom();
       gato1.amamentar();
       
       System.out.println("NOME: "+gato1.getNome());
       System.out.println("RAÇA: "+gato1.getRaça());
       
       
       Papagaio papagaio1 = new Papagaio();
       
       papagaio1.setNome("BARRABAS");
       papagaio1.EmitirSom();
       papagaio1.voar();
      
       System.out.println("NOME: "+papagaio1.getNome());
        
        
    }
    
}
