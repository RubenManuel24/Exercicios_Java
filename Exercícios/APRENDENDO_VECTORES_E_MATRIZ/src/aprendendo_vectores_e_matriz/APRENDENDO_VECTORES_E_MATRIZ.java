/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aprendendo_vectores_e_matriz;

/**
 *
 * @author FATIMA30
 */
public class APRENDENDO_VECTORES_E_MATRIZ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
        double temperatura[] = new double[365];
        temperatura[0]= 31.3;
        temperatura[1]=32;
        temperatura[2]=34.7;
        temperatura[3]=32.9;
        temperatura[4]=29;
        
        System.out.println("O VALOR DA TEMP DO DIA 1 É:" + temperatura[3]);
               
        System.out.println(temperatura.length);    
        
        
       for(int cont=0; cont<temperatura.length; cont++){
    
    System.out.println("O VALOR DA TEMP DO DIA NA POSIÇÃO: " +(cont+1)+ " " +temperatura[cont]);
        
       
    } 
        
         /*for(double a: temperatura){
        
            System.out.println(a);*/
        
        }
        
    }
    
}
















