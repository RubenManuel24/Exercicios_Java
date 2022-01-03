
package exercícios_de_metodos.rferencia_e_função;


public class ExpoInt {
    
    public static double ValorFuturo (double c, double i, double n){
    
         double v = c*(1+i);
        
         double valor = Math.pow(v, n);
    
        return valor;
    }
    
    public static double CapitalNecessario (double n, double i, double fv){
    
       double v2 = (1+i);
       double ex = Math.pow(v2, n);
            
      double valor2 = fv/ex;
    
      return valor2;
    }
    
   
    
    public static void main(String[] args) {
        
        System.out.println("CALCULOS DE FINANÇAS:");
        
        double a = ValorFuturo(2,5,10);
        
        double b = CapitalNecessario(7,a ,4);
        
        System.out.printf("O VALOR FUTURO É: %.1f\n",a);
        
        System.out.printf("O CAPITAL NESSARIO É: %.1f\n",b);
    }
    
}
