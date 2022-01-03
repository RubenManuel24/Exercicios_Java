
package zoo;
public class TesteZoo {
    public static void main(String[] args) {
       
        Mamifero camelo = new  Mamifero();
        Mamifero cao = new Mamifero();
        Mamifero golfinho = new Mamifero();
        Peixe tubarao = new Peixe();
        Mamifero cavalo= new Mamifero();
        Peixe carapao = new Peixe();
        
        System.out.println("\t>>>JARDIM ZOOLÓGICO<<<");
        camelo.setNome("Camelo");
        camelo.setComprimento(200);
        camelo.setNumeroPatas(4);
        camelo.setCor("Castanho");
        camelo.setAmbiente("Terra");
        camelo.setVelocidade(3);
        camelo.setAlimento("Ervas");
        System.out.println(camelo.toString());
        
        
        cao.setNome("Cão");
        cao.setComprimento(60);
        cao.setNumeroPatas(4);
        cao.setCor("Castanho");
        cao.setVelocidade(6); 
        cao.setAmbiente("Terra");
        cao.setAlimento("Raçao");
        System.out.println(cao.toString());
        
        golfinho.setNome("Gorfinho");
        golfinho.setComprimento(150);
        golfinho.setNumeroPatas(0);
        golfinho.setCor("Cizento");
        golfinho.setVelocidade(10); 
        golfinho.setAmbiente("Água");
        golfinho.setAlimento("Frutos do mar");
        System.out.println(golfinho.toString());
        
        tubarao.setNome("Tubarão");
        tubarao.setComprimento(150);
        tubarao.setNumeroPatas(0);
        tubarao.setCor("Cizento");
        tubarao.setVelocidade(10); 
        tubarao.setAmbiente("Água");
        tubarao.setCaracteristica(" ");
        System.out.println(tubarao.toString());
        
        cavalo.setNome("Cavalo");
        cavalo.setComprimento(150);
        cavalo.setNumeroPatas(4);
        cavalo.setCor("preto");
        cavalo.setAmbiente("Terra");
        cavalo.setVelocidade(20);
        cavalo.setAlimento("Ervas");
        System.out.println(cavalo.toString());
       
        carapao.setNome("Carapao");
        carapao.setComprimento(5);
        carapao.setNumeroPatas(0);
        carapao.setCor("Cizento");
        carapao.setAmbiente("Água");
        carapao.setVelocidade(1);
        carapao.setCaracteristica(null);
        System.out.println(carapao.toString());
                
        
                
    }
    
}
