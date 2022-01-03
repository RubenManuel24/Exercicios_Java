
package carro;

public class frabricacao {
    public static void main(String[] args) {
        
        Carro carro1 = new Carro();
        
        carro1.setMarca("TOYOTA");
        carro1.setCor("PRETA");
        carro1.setMatricula("LD 23 45");
        carro1.setPotencia("344");
        carro1.setKilometragem(300);
        carro1.setAno_fabrico(2000);
        carro1.setVelocidade(0);
        carro1.setGasolina(15);
        carro1.setLigado(true);
        
        carro1.status();
        carro1.estado_car();
        carro1.no_ou_anti();
        
        System.out.println(" ");
        System.out.println(" ");
        
        Carro carro2 = new Carro();
        
        carro2.setMarca("CAMARO");
        carro2.setCor("VERMELHO");
        carro2.setMatricula("LD 23 35 B");
        carro2.setPotencia("500");
        carro2.setKilometragem(350);
        carro2.setAno_fabrico(2018);
        carro2.setVelocidade(0);
        carro2.setGasolina(0);
        carro2.setLigado(true);
        
        carro2.status();
        carro2.estado_car();
        carro2.no_ou_anti();
        
    }
    
    
    
    
   
}
