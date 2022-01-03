
package exercícios_de_metodos.rferencia_e_função;


public class numeracao_n1_a_n2 {
    
  public static void numero2(int a, int b){
    
        for(int cont = a; cont<=b; cont++){
        
            System.out.println(cont);
            
        }
    
    }
        
    public static void main(String[] args) {
        
        System.out.println("CONTAGEM DE N1 PARA N2:");
        numero2(100,1000);
        
    }
            
    
}
