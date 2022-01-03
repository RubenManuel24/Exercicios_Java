
package exercícios_de_metodos.rferencia_e_função;

public class maior_ou_menor_com_menu {
    
    public static int maior (int a, int b){
    
        int v=0;
          if(a>b){
              v =a; 
          }
          else{
              v=b;
          }
          return v;
    }
    
    public static int menor (int a, int b){
    
    int v=0;
    
    if(a>b){
        v=b;
    }
    
    else{
    
        v=a;
    }
    return v;
    }
    
    public static void main(String[] args) {
        
        System.out.println("DIGITE OS VALORES:");
        
        int sn= maior(2,23);
        
        int sm = menor(18,4);
        
        
        System.out.println("O MAIOR NÚMERO É: "+sn);
        
        System.out.println("O MENOR NÚMERO É: "+sm);
    }
    
}
