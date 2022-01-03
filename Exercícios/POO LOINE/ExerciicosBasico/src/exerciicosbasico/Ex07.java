
package exerciicosbasico;

import java.util.Scanner;

public class Ex07 {
    
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        double ganhoHora;
        int horaTrabalhadaMes;
        double totalSalario;
        
        System.out.println("QUANTO VOCÊ GANHA POR MÊS: ");
        ganhoHora=leia.nextDouble();
        System.out.println("QUAL É O NÚMERO DE HORA TRABALHADA NESSE MÊS: ");
        horaTrabalhadaMes=leia.nextInt();
        totalSalario=ganhoHora*horaTrabalhadaMes;
        System.out.println("O TOTAL DO TEU SALÁRIO NESSE MÊS É DE: "+totalSalario+ " MIL Kz");
    }
}
