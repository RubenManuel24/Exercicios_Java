
package exercícios_de_metodos.rferencia_e_função;


public class Media_3 {
    
    public static double media(double a, double b, double c){
    
        double s=(a+b+c)/3;
        
      return s;
    }
    
    public static void main(String[] args) {
        
        double f=media(12,20,5);
        
        System.out.printf("A MEDIA DO ALUNO É: %.1f\n",f);
        
    }
    
}
