
package exloops;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        boolean validar=true;
       
        
        while(validar==true){ 
            String nome;
            String senha;
             System.out.println("DIGITE O NOME:");
             nome=leia.nextLine();
             System.out.println("DIGITE A SENHA:");
             senha=leia.nextLine();
             
            if(nome == null ? senha == null : nome.equals(senha)){
                System.out.println("ERRRO");
                validar=true;
            }
            else{
                System.out.println("SEJÁ BEM-VINDO");
                validar=false;
            
            }
        }
        
        
        
        
    }
    
}
