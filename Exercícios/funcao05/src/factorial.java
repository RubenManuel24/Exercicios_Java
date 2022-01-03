





public class factorial {
    
    private int num = 0;
    private int fat = 1;
    private String formula = "";
    
    
    public void setValor(int n){
    
        num = n;
        int f = 1;
        String s="";
        for(int c = n; c > 1; c--){
         f =f*c;
         s=s+c+" x ";
         
        } 
        s=s+" 1 = "+fat;
        fat=f; 
        formula=s;
        
       
    }
    
     public int getfatorial(){
    
       return fat;
    }
    
     public String getformula(){
    
        return formula ;
    }
    
}
