
package exercícios_de_metodos.rferencia_e_função;


public class Aprovacao {
    
    public static boolean aprovado(int a){
         boolean n=true;
     
           if(a>=7 ){
               
               
                 n = true;
               
               
            }
           
             else{
             
               
                 n = false;
               
                
           }  
       return n;
    }
    
    public static void main(String[] args) {
        
        boolean b;
        
        b=aprovado(-12);
        
        System.out.println("O ALUNO ESTÁ: "+b);
        
    }
    
}
