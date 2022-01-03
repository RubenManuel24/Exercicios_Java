
package exloops;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner leia= new Scanner(System.in);
        
        boolean validar=true;
        
        while(validar==true){
            String nome;
            int idade;
            double salario;
            String sex;
            String estCivil;
            
            System.out.println("NOME:");
            nome=leia.nextLine();
            System.out.println("SEXO:");
            sex=leia.next();
            System.out.println("IDADE:");
            idade=leia.nextInt();
            System.out.println("ESTADO CIVIL:");
            estCivil=leia.next();
            System.out.println("SALÁRIO:");
            salario=leia.nextDouble();
            
            
            if((nome.length()>=6) && idade >=0 || idade<=150 && salario>0 && ("F".equals(sex) || "M".equals(sex)) && ("S".equals(estCivil) || "C".equals(estCivil) || "V".equals(estCivil) || "D".equals(estCivil)) ){
             
                System.out.println("SEJA BEM VINDO");
                validar =false;
             
            }
            else{
              
                System.out.println("»»»»»TENTA OUTRA VEZ«««««");
                validar=true;
            
            }
         
        }
        
    }
}
