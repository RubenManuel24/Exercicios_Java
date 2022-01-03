/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectores;

import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author FATIMA30
 */
public class VECTORS {
    public static void  main(String[]args){
    
        int a [] = {17,33,45,63,24,12,52,72,61,13};
        
       Arrays.sort(a, Collections.reverseOrder());
        
        for(int b: a ){
        
            System.out.println(b);
        }
    
    }
    
}
