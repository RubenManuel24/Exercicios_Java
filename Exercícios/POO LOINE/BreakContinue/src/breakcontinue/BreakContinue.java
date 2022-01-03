
package breakcontinue;

import java.util.Scanner;

public class BreakContinue {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        int n1;
        int n2;
        
        System.out.println("Digite o primeiro númreo: ");
        n1=leia.nextInt();
        System.out.println("Digite o segundo número: ");
        n2=leia.nextInt();
        
        for(int cont=n1; cont<=n2; cont++){ 
            
            if(cont%7==0){
             
               break;
            }
            else{
                System.out.println(cont);
            }
        
        
        }
            
    } 
    
}
