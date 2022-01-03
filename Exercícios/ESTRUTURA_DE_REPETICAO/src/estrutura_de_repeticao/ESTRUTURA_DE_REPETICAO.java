/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estrutura_de_repeticao;

/**
 *
 * @author FATIMA30
 */
public class ESTRUTURA_DE_REPETICAO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int cont;
        
        cont = 1;
        
        while(cont<10){
          
            cont++;
            /*if(cont == 3 || cont == 7 || cont == 9){
                 continue;
            } */
            if(cont == 8){
                break;
            }
            
        System.out.println("CAMBALHOTA "+cont);
                   
        }

        
    }
    
}
