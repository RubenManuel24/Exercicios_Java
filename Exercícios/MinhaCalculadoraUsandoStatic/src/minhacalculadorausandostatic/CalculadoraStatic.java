
package minhacalculadorausandostatic;
public class CalculadoraStatic {
     
    public static int soma(int num1, int num2 ){
        int a=num1+num2;
      return a;
    }
    public static int soma(int num1, int num2, int num3){
      int a=num1+num2+num3;
      return a;
    }
    public static double soma(double num1, double num2){
     double a=num1+num2;
     return a;
    }
    public static void fatorial(int num){
            int fatorial=1;
        for( int cont=1; cont<=num; cont++){
          
             fatorial*=cont;
        }
        System.out.println("O fatorial de "+num+" é: "+fatorial);
    
    }
}
