
package exercícios_de_metodos.rferencia_e_função;


public class Fatorial {
    
    static int conta(int a){
        
        int factorial=1;
    
       for(int cont=1; cont<=a; cont++){
       
         factorial*=cont;
       
       }
           
       return factorial;
    }
    
    public static void main(String[] args) {
        
        System.out.println("CALCULO DE FACTORIAL");
        
        int receptor=conta(10);
        
        
        System.out.println("O FACTORIAL DE É: " +receptor);
    }
    
}
