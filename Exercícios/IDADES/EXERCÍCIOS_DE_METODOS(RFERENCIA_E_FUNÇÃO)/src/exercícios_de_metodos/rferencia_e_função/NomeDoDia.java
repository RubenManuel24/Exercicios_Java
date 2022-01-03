/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercícios_de_metodos.rferencia_e_função;

/**
 *
 * @author FATIMA30
 */
public class NomeDoDia {
    
    static String dia(int a){
    
     String b;
      
     switch(a){
     
         case 1: b="DOMINGO";
         break;
             
         case 2: b="SEGUNDA";
         break;
             
         case 3: b="TERÇA-FEIRA";
         break;
             
         case 4: b="QUARTA-FEIRA";
         break;
             
         case 5: b="QUINTA-FEIRA";
         break;
             
         case 6: b="SEXTA-FEIRA";
         break;
             
         case 7: b="SÁBADO";
         break;
         
         default: b="ERRO";
     
     }
    
        return b;
    }
    
    public static void main(String[] args) {
        
        String re=dia(9);
        
        System.out.println("O DIA É: "+re);
        
    }
    
}
