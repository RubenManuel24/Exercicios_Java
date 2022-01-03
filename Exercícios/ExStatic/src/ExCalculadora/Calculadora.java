
package ExCalculadora;
public class Calculadora {
    
    public static void soma(int a, int b){
        int c=a+b;
        System.out.println("A soma de "+a+"+"+b+"="+c);
    }
    
    public static void subtrair(int a, int b){
        int c=a-b;
        System.out.println("A subtração de "+a+"-"+b+"="+c);
    }
    
    public static void multiplicar(int a, int b){
        int c=a*b;
        System.out.println("A multiplicação de "+a+"*"+b+"="+c);
    
    }
    public static void dividir(int a, int b){
        int c=a/b;
        System.out.println("A divisão de "+a+"/"+b+"="+c);
    }
    public static void potencia(int a, int b){
        int c=(int) Math.pow(a, b);
        
        System.out.println("A potencia de  "+a+" elevado a "+b+"="+c);
    }
    
    
}
