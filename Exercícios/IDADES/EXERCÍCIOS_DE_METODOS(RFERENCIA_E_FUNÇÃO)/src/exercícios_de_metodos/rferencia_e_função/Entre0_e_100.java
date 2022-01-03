
package exercícios_de_metodos.rferencia_e_função;


public class Entre0_e_100 {
    
    
    public static boolean interval(int a){
    
          boolean v;
          
          if(a>=0&& a<=100){
          
            v=true;
          
          }
          
          else{
          
            v=false;
          
          }
          
          return v;
    }
    
    public static void main(String[] args) {
         
        boolean s;
        
        s=interval(-12);
        
        System.out.println("O RESULTADO É:"+s);
    }
    
}
