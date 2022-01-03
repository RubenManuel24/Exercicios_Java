
package breakcontinue;

import java.util.Scanner;

public class Continue {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        for(int cont=0; cont<=10; cont++){
        if(cont==9){
          continue;
        }
        else{
            System.out.println(cont );
        
        }
        
        }
        
    }
    
}
