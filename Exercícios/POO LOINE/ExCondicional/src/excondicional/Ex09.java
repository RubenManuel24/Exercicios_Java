package excondicional;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        String turno;
        
        System.out.println("VOCÊ ESTUDA EM QUE TURNO:");
        turno=leia.nextLine();
        
        switch(turno){
              
            case "M":System.out.println("BOM DIA");
                break;
            case "V":System.out.println("BOA TARDE");
                break;
            case "N":System.out.println("BOA NOITE");
                break;
            default: System.out.println("VALOR INVÁLIDO");
        
        }
    }
    
}
