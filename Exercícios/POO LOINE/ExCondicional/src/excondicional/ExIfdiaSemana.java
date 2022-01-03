package excondicional;
import java.util.Scanner;
public class ExIfdiaSemana {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int diaSemana;
        
        System.out.println("DIGITE UM DIA DA SEMANA: ");
        diaSemana=leia.nextInt();
        
        if(diaSemana==1){
            System.out.println("DOMINGO");
        }
        else if(diaSemana==2){
            System.out.println("SEGUNDA");
        }
        else if(diaSemana==3){
            System.out.println("TERÇA");
        }
        else if(diaSemana==4){
            System.out.println("QUARTA");
        }
        else if(diaSemana==5){
            System.out.println("QUINTA");
        }
        else if(diaSemana==6){
            System.out.println("SEXTA");
        }
        else if(diaSemana==7){
            System.out.println("SÁBADO");
        }
        else{
            System.out.println("DIA INVÁLIDO");
        }  
    }  
}
