package excondicional;
import java.util.Scanner;
public class Ex08 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int n1,n2,n3;
        
        System.out.println("DIGITE O PRIMEIRO NÚMERO:");
        n1=leia.nextInt();
        System.out.println("DIGITE O SEGUNDO NÚMERO:");
        n2=leia.nextInt();
        System.out.println("DIGITE O TERCEIRO NÚMERO:");
        n3=leia.nextInt();
        
        if(n1>n2 && n1>n3 && n3<n2){
            System.out.println("O MAIOR NÚMERO É: "+n1);
            System.out.println("O MENOR NÚMERO É: "+n3);
        
        }
        else if(n1>n2 && n1>n3 && n2<n3){
           System.out.println("O MAIOR NÚMERO É: "+n1);
           System.out.println("O MENOR NÚMERO É: "+n2);
        
        }
        else if (n2>n1 && n2>n3 && n1<n3){
            System.out.println("O MAIOR NÚMERO É: "+n2);
            System.out.println("O MENOR NÚMERO É: "+n1);
        }
        else if (n2>n1 && n2>n3 && n3<n1){
            System.out.println("O MAIOR NÚMERO É: "+n2);
            System.out.println("O MENOR NÚMERO É: "+n3);
        }
        
        else if(n3>n1 && n3>n2 && n2<n1){
        
         System.out.println("O MAIOR NÚMERO É: "+n3);
          System.out.println("O MENOR NÚMERO É: "+n2);
        }
         else if(n3>n1 && n3>n2 && n1<n2){
        
         System.out.println("O MAIOR NÚMERO É: "+n3);
          System.out.println("O MENOR NÚMERO É: "+n1);
        }
    }
    
}
