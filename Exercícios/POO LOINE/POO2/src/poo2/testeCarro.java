
package poo2;
public class testeCarro {
    public static void main(String[] args) {
        
        Carro c1 = new Carro();
        
        c1.marca="FIAT";
        c1.modelo="DUCATE";   
        c1.numPassageiros=10;
        c1.capCombustivel=100;
        c1.consumoCombustivel=0.2;
        
        System.out.println("MARCA: "+c1.marca);
        System.out.println("MODELO: "+c1.modelo);
        System.out.println("NÚMERO DE PASSAGEIRO: "+c1.numPassageiros);
        System.out.println("CAPACIDADE DO COMBUSTÍVEL: "+c1.capCombustivel);
        System.out.println("CONSUMO DO COMBUSTÍVEL: "+c1.consumoCombustivel);
        
        c1.exibirAutonomia(); 
       
        
        System.out.println("A AUTONOMIA DO CARRO É: "+c1.obterAutonomia());
        
        
        System.out.println("QUANTIDADE DE COMBUSTIVEL "+c1.calcularCombustivel(20));
        System.out.println("QUANTIDADE DE COMBUSTIVEL "+c1.calcularCombustivel(80));
    }
}
