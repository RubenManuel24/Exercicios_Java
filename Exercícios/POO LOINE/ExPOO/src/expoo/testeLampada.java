
package expoo;
public class testeLampada {
    public static void main(String[] args) {
       
        Lampada L1 = new Lampada();
        
        L1.setMarca("LUZ DO SOL");
        L1.setTipo("NORMAL");
        L1.setCor("PRETA");
        L1.setPotencia(4);
        L1.setTamanho(3);
        L1.setLigada(false);
        
        //System.out.println(L1.getMarca() );
        
        
        L1.ligarLampada();
        L1.status();
        
        
        
    
       
    }
    
}
