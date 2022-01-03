
package insecto;
public class Insec2 {
    
    public static void main(String[] args) {
        
        Insecto I2 = new Insecto();
        
        I2.nome="ARANHA";
        I2.cor="PRETA";
        I2.genero='F';
        I2.tamanho=(double)10;
        I2.N_perna=6;
        I2.asa=false;
        
        I2.status();
        
        I2.voar();
        
        I2.correr();
        
    }
    
}
