
package excondicional;

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner leia= new Scanner(System.in);
        
        int litro;
        String comb;
        double preA=1.90;
        double preG=2.50;
        double desc;
        double pagarSemdesc;
        double pagarComdesc=0;
        boolean valido=true;
        
        System.out.println("NÚMERO DE LÍTROS VENDIDOS: ");
        litro=leia.nextInt();
        System.out.println("TIPOS DE COMBUSTÍVEL: \nÁLCOOL;\nGASOLINA");
        System.out.println("DIGITA O TIPO DE COMBUSTÍVEL: ");
        comb=leia.next();
        
        switch(comb){
            case "A": 
                System.out.println("»»»»»»»»»ÁLCOOL»»»»««««««««");
               if(litro<=20){
                          pagarSemdesc =(litro*preA);
                          desc=pagarSemdesc*0.3;
                          pagarComdesc=pagarSemdesc-desc;
                }
                else{
                          pagarSemdesc =(litro*preA);
                          desc=pagarSemdesc*0.05;
                          pagarComdesc=pagarSemdesc-desc;
                          
               }
               break;
            case "G":
                System.out.println("»»»»»»»»»GASOLINA»»»»««««««««");
                if(litro<=20){
                    pagarSemdesc= (litro*preG);
                    desc=pagarSemdesc*0.05;
                    pagarComdesc=pagarSemdesc-desc;
                
                }
                else{
                    pagarSemdesc= (litro*preG);
                    desc=pagarSemdesc*0.06;
                    pagarComdesc=pagarSemdesc-desc;
                
                }
              break;
                
            default: 
                    System.out.println("TIPO DE COMBUSTÍVEL INVÁLIDO");
                    valido=false;
        }
       
        if(valido==true){
        System.out.printf("O VALOR A SER PAGPO PELO CLIENTE É DE: %.1f\n",pagarComdesc,"MIL Kz");}
        
        
        
    }
}
