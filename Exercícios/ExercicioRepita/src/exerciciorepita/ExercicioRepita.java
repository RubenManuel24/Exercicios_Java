/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciorepita;
import javax.swing.JOptionPane;
/**
 *
 * @author FATIMA30
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long n;
        long soma=0;
        int par = 0;
        int impar = 0;
        int maior = 0;
        int numD = 0;
        double media;
        
        do{
             n = Integer.parseInt(JOptionPane.showInputDialog(null,"DIGITA UM NUMERO: \n(SE DIGITAR 0 ELE PARA)"));
             soma+=n;
             numD +=1;
             
           if(n%2==0){
            
            par +=1;
           }
           else  if(n>100){
               maior += 1;
          
           }
           else if(n%2==1) {
               
             impar += 1;
               
          }
           
          
                
        }
          while(n != 0);
        
        media=soma/numD;
        JOptionPane.showMessageDialog(null, "TOTAL DE VALORES: "+numD+"\nTOTAL PARES: "+par+"\nTOTAL IMPARES: "+impar+"\nACIMA DE 100: "+maior+"\nMEDIA DOS VALORES: "+media);
        
        
        
        // TODO code application logic here
    }
    
}
