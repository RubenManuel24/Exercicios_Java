
package exercícios_de_metodos.rferencia_e_função;


public class ExpReal {
    
    public static int Exp(int a, int b){
        
        int s= (int) Math.pow(a, b);
    
      return s;
    
    }
    
    public static void main(String[] args) {
        
        int p = Exp(3,2);
        
        System.out.println("O RESLTO É "+p);
        
    }
    
}
