/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pequenodev;

import java.util.Scanner;

/**
 *
 * @author FATIMA30
 */
public class DispesasDoCasal {
    public static void main(String[]args){
    Scanner escreva = new Scanner(System.in);
    
    double dispesaT;
    double dispesaM;
    double dispesaH;
    double percT;
    double percH;
    double percM;
    double valorDevido;
    double saldoH;
    double saldoM;
    double a ;
    double b;
    
    System.out.println("DIGITE VALOR DAS DESPESAS DO HOMEM:");
    dispesaH = escreva.nextDouble();
    
    System.out.println("DIGITE VALOR DAS DESPESAS DA MARIDO:");
    dispesaM = escreva.nextDouble();
    
    dispesaT = dispesaH + dispesaM;
    percH = (dispesaH/ dispesaT)*100;
    percM = (dispesaM/ dispesaT)*100;
    percT = percH + percM;
    valorDevido = dispesaT/2;
    a = (dispesaH - dispesaT);
    saldoH = a/2;
    b  = (dispesaM - dispesaT)/2;
    saldoM = b/2;
        System.out.printf("ITEM          MARIDO         ESPOSA         TOTAL\n======        =======        ======        ======\nDESPESAS PAGAS   %.2f   %.2f     %.2f\n  PAGO            %.2f        %.2f        %.2f\nVALOR DEVIDO    %.2f     %.2f     %.2f\n SALDO        %.2f        %.2f      ",dispesaH,dispesaM,dispesaT,percH,percM,percT,valorDevido,valorDevido,dispesaT,saldoH,saldoM);
    
    }
            
    
}
