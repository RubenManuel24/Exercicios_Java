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
public class mair_de_2 {
    
    public static int mai2 (int a, int b){
    
        int v;
        
        if(a>b){
        
           v=a;
        
        }
        
        else{
        
          v=b;
            
        }
         return v;
    }
    
    public static void main(String[] args) {
        
        int recebe;
        
        recebe=mai2(23,49);
        
        System.out.println("O MAIOR É: "+recebe);
        
    }
    
}
