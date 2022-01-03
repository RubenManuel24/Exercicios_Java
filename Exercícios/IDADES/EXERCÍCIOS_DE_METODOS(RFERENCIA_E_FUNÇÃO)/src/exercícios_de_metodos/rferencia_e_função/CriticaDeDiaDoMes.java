
package exercícios_de_metodos.rferencia_e_função;


public class CriticaDeDiaDoMes {
    
    static String mes(int a){
        
        String recep;
        
        switch(a){
        
            case 1: recep="JANEIRO";
            break;
            
            case 2: recep="FEVEREIRO";
            break;
            
            case 3: recep="MARÇO";
            break;
                
            case 4: recep="ABRIL";
            break;
                
            case 5: recep="MAIO";
            break;
                
            case 6: recep="JUNHO";
            break;
                
            case 7: recep="JULHO";
            break;
                
            case 8: recep="AGOSTO";
            break;
                
            case 9: recep="SETEMBRO";
            break;
                
            case 10: recep="OUTUBRO";
            break;
                
            case 11: recep="NOVEMBRO";
            break;
                
            case 12: recep="DEZEMBRO";
            break;
                
            default: recep="ERRO";
        
        }
        
        return recep;
                
    }
    
    public static void main(String[] args) {
        
        String b=mes(14);
        
        System.out.println("O MÊS É: "+b);
    }
    
}
