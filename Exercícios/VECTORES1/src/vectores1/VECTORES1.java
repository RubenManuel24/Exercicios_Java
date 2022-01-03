/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectores1;

import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author FATIMA30
 */
public class VECTORES1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int b;
        int num[] = {111,30,15,7,9,13,12};
       // b = Arrays.binarySearch(num,7);
        Arrays.sort(num, Collections.revers);
        
        for(int a=0; a < num.length; a++)
        {
            System.out.println(num[a]);
       
        }
        System.out.println(b);
        // TODO code application logic here
    }
    
}
