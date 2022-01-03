/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriz;

/**
 *
 * @author FATIMA30
 */
public class MatrizContin2 {
    public static void main(String[]args){
        
        int [][][] matri3 = new int [3][3][3];
        
        for(int i=0; i<matri3.length;i++){
        
            for(int j=0; j<matri3[i].length; j++){
            
                for(int k=0; k<matri3[i][j].length; k++){
                    System.out.println("i = " + i + " - j = " + j + "  -k = " + k);
                matri3[i][j][k]= i+j+k;
                
                }
            
            }
        
        }
          int soma=0;
          int par=0;
          int impar=0;
         for(int i=0; i<matri3.length;i++){
        
            for(int j=0; j<matri3[i].length; j++){
            
                for(int k=0; k<matri3[i][j].length; k++){
                
                  soma+=matri3[i][j][k];
                  
                if(matri3[i][j][k]%2==0){
                    par+=matri3[i][j][k];
                }
                
                else{
                
                impar+=matri3[i][j][k];
                }
                }
            
            }
        }
        
        
             System.out.println("A SOMA É: "+soma);
             System.out.println("A SOMA DE PAR: "+par);
             System.out.println("A SOMA DE IMPAR: "+impar);
    
    }
}
