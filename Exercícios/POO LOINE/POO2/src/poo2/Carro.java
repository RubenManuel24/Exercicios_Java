
package poo2;
public class Carro {
    
    String marca; 
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;
    
    void exibirAutonomia(){
      
         System.out.println("A autonomia do carro é: "+this.capCombustivel*this.consumoCombustivel+ " Km");
        
    }
    
    double obterAutonomia(){
        System.out.println("======================================");
        System.out.println("MÉTODO OBTER AUTONOMIA FOI CHAMADO.");
      double a=capCombustivel*consumoCombustivel;
      return a;
    }
    
    double calcularCombustivel(double km){
    
         double qtdCombustivel = km/this.consumoCombustivel;
         
         return qtdCombustivel;
    } 
    
}
