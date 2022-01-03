
package exercícios_de_metodos.rferencia_e_função;


public class NumPrimo {
    
    static boolean num(int n){
    
        boolean result;
        
        if(n%2==0 && n%n-1==0){
    
         
         result=false;
    }
        else{
        
           result=true;
        }
         return result;
    }
    
    public static void main(String[] args) {
        
        boolean recep=num(11);
        
        System.out.println("O NÚMERO É PRIMO: "+recep);
        
    }
    
}
