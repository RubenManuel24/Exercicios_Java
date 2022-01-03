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
public class UsoDeMath {
    public static void main(String[]args){
        Scanner escreva = new Scanner(System.in);
        float valor;
        float raiz;
        float log;
        float ex;
        float rer;
        float rel;
        float ree;
        System.out.println("DIGITE UM VALOR:");
        valor = escreva.nextInt();
        
        raiz =  (float) Math.sqrt(valor);
        log =  (float) Math.log(valor);
        ex =  (float) Math.exp(valor);
        
        rer = Math.round(raiz);
        rel = Math.round(log);
        ree = Math.round(ex);
        
        System.out.printf("A RAIZ DE %.0f É: %.1f \n",valor,rer);
        System.out.printf("O LOGARITMO DE %.0f É: %.1f \n",valor,rel);
        System.out.printf("O EXPONECIAL DE %.0f É: %.1f \n",valor,ree);
        
        
        
        
        
        
        
        
    }
    
}
