
package excondicional;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner leia=new Scanner(System.in);
    String sexo;
    
        System.out.println("DIGITE \"F\" OU \"M\" :");
        sexo=leia.nextLine();
        
        switch(sexo){
            case "F": System.out.println("FEMENIO");
                break;
            case "M": System.out.println("MASCULINO");
                break;
            default: System.out.println("SEXO INVÁLIDO");
        
        
        }
    }
}
