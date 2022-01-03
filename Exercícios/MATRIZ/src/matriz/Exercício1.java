/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriz;

import java.util.Scanner;

/**
 *
 * @author FATIMA30
 */
public class Exercício1 {
    public static void main(String[]args){
     Scanner escreva = new Scanner(System.in);
     int[][] m = new int[4][4];
     
       
     
     for(int i=0; i<m.length; i++){
    
        for(int j=0; j<m[i].length; j++){
        
        System.out.printf("DIGITA O VALORE DO DA LINNA %d E DA COLUNA %d: ",i,j);
        m[i][j] = escreva.nextInt();
        
        }
         System.out.println("  ");
     }
    
    for(int i=0; i<m.length; i++){
    
        for(int j=0; j<m[i].length; j++){
        
            System.out.println("OS VALORES DIGITADOS SÃO: "+m[i][j]);
        }
        System.out.println("  ");
    } 
    }
}
