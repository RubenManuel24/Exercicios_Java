
package insecto;
public class Insec1 {
    
    public static void main(String[] args) {
        
        Insecto I1 = new Insecto();
        
        I1.nome="MOSCA";
        I1.cor="VERDE";
        I1.genero='M';
        I1.tamanho=0.3;
        I1.N_perna=4;
        I1.asa=true;
        
        I1.status();
        
        I1.voar();
        
        I1.correr();
        
    }
    
}
