
package exercícios_de_metodos.rferencia_e_função;


public class Bissexto {
    
    
    static boolean bisa(int ano){
    
        boolean con;
        
      if(ano%4==0){
      
          con=true;
      
      }
      
      else{
      
         con= false;
      }
      
      return con;
    }
    
    public static void main(String[] args) {
        
        System.out.println("DIGITE UM ANO:");
         
        boolean a = bisa(2028);
        
        System.out.println("O ANO DIGITADO É BISSEXTO? :"+a);
    }
    
}
