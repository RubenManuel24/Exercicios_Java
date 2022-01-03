
package exercícios_de_metodos.rferencia_e_função;



public class maior_de_3 {
    
    public static int maior (int a, int b, int c){
        
        int t;
    
      if(a>b && a>c){
      
        t=a;
      }
      
      else if(b>a && b>c){
      
          t=b;
      }
      
      else{
      
        t=c;
      }
      
      return t;
    
    }
    
    public static void main(String[] args) {
        
        int v;
        
        v=maior(83,384,67);
        
        System.out.println("O MAIOR É: "+v);
    }
}
