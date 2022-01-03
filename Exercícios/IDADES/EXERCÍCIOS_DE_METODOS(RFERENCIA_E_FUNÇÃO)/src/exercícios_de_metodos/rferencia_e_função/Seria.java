
package exercícios_de_metodos.rferencia_e_função;


public class Seria {
    static double serie1(int n){
    
       double s;
       
      
       s=1-((n/ Math.pow(3, 2))+(n/ Math.pow(5, 2))-(n/ Math.pow(7, 2))+(n/ Math.pow(9, 2)));
       
       return s;
    }
    
    public static void main(String[] args) {
        
        double reseptor = serie1(100);
        
        System.out.printf("O VALOR É: %.1f",reseptor);
        
    }
    
}
