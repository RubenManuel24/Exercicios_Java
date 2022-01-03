
package vectores;
public class Ex01 {
    public static void main(String[] args) {
        int [] a = new int[5];
        int [] b= new int [5];
        
        a[0]=12;
        a[1]=13;
        a[2]=34;
        a[3]=45;
        a[4]=67;
        
        for(int cont = 0; cont<a.length; cont++){
        
             b[cont]=a[cont];
             
             System.out.println(b[cont]);
        }
        
    }
    
}
