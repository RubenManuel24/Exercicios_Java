
package exstatic;
public class Contador {
    
        //Atributo
   private static int cont;
    //Métodos especiais
   

    public static int getCont() {
        return cont;
    }

    public static void setCont(int a) {
        cont = a;
    }
    //Método
    public static void incre(){
       cont++;
    }
    public static void zerar(){
       cont=0;
    }
    public static int retornar(){
     
    return cont;
    }
    public static void status() {
        System.out.println("CONTADOR: "+cont);
    } 
}
