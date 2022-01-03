
package exerciicosbasico;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner leia= new Scanner(System.in);
        double ganhoHora;
        int horaTrabalhoMes;
        double tSMesBruto;
        double salarioLiquido;
        double inss;
        double sindicato;
        double renda;
        System.out.println("QUANTO VOCÈ GANHA POR HORA: ");
        ganhoHora=leia.nextDouble();
        System.out.println("QUANTAS HORAS TRABALHASTE NESSE MÊS: ");
        horaTrabalhoMes=leia.nextInt();
        tSMesBruto=ganhoHora*horaTrabalhoMes;
        
        
        renda=tSMesBruto*0.11;
        inss=tSMesBruto*0.08;
        sindicato=tSMesBruto*0.05;
        
        salarioLiquido=(((tSMesBruto-renda)-inss)-sindicato);
        
        System.out.printf("O SALARIO BRUTO É DE: %.1f Kz\n",tSMesBruto);
        System.out.printf("FOI PAGO AO INSS: %.1f Kz\n",inss);
        System.out.printf("FOI PAGO AO SINDICATO: %.1f Kz\n",sindicato);
        System.out.printf("O SALÁRIO LÍQUIDO: %.1f Kz\n",salarioLiquido);
        
        
    }
    
}
