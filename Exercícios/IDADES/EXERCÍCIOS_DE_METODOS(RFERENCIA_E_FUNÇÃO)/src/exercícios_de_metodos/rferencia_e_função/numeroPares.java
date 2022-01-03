
package exercícios_de_metodos.rferencia_e_função;

public class numeroPares {
    
  public static void numPar(int a, int b){
        
        if(b>a){
        
            for(int cont=a; cont<=b; cont++){
            
                if(cont%2==0){
                
                    System.out.println(cont);
                
                }
            }
        }
    
    }
    
    
    public static void main(String[] args) {
        
        System.out.println("NUMEROS PARES:");
        
        numPar(100,150);
        
    }
            
    
}
