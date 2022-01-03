
package javaapplication81;
public class Carro {
    
      Carro(){
          System.out.println("O CARRO FOI INSTÂNCIADO");
      
      }
    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;
    
    void exibirAutonomia(){
        System.out.println("A AUTONOMIA DO CARRO É: "+capCombustivel*consumoCombustivel);
        
    }
    
    
}
