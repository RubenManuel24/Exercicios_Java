
package excondicional;

import java.util.Scanner;

public class Ex04 {
    
    public static void main(String[] args) {
        Scanner leia= new Scanner(System.in);
        
        System.out.println("DIGITE UMA LETRA:");
       String letra=leia.nextLine();
        
        switch(letra){
            case "a": System.out.println("A LETRA DIGITADA É VOGAL");
                break;
            case "e" : System.out.println("A LETRA DIGITADA É VOGAL");
                break;
            case "i": System.out.println("A LETRA DIGITADA É VOGAL");
                break;
            case "o": System.out.println("A LETRA DIGITADA É VOGAL");
                break;
            case "u": System.out.println("A LETRA DIGITADA É VOGAL");
                break;
            default: System.out.println("A LETRA DIGITADA É UMA CONSOANTE");
        }
    }
    
}
