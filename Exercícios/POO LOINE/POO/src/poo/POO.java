 
package poo;
public class POO {
    public static void main(String[] args) {
        
        Carro van = new Carro();
        van.cor="Preta";
        van.marca="Fiat";
        van.modelo="Ducato";
        van.numeroPassageiro=10;
        van.capacidadeCombustivel=100;
        van.consumoCombustivel=0.2;
        
        
        System.out.println(van.cor);
        System.out.println(van.marca);
        System.out.println(van.modelo);
        System.out.println(van.numeroPassageiro);
        System.out.println(van.capacidadeCombustivel);
        System.out.println(van.consumoCombustivel);
        
        
        
        System.out.println("=======================");
        
         Carro carolux = new Carro();
        carolux.cor="Azul";
        carolux.marca="Toyota";
        carolux.modelo="Fusca";
        carolux.numeroPassageiro=4;
        carolux.capacidadeCombustivel=50;
        carolux.consumoCombustivel=0.2;
        
        
        System.out.println(carolux.cor);
        System.out.println(carolux.marca);
        System.out.println(carolux.modelo);
        System.out.println(carolux.numeroPassageiro);
        System.out.println(carolux.capacidadeCombustivel);
        System.out.println(carolux.consumoCombustivel);
    }
    
}
