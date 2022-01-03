
package LampadaP00;
public class TesteLampada {
    public static void main(String[] args) {
        
        //Primeira Lâmpada
        Lampada L1=new Lampada();
        L1.setMarca("Ligth nigth");
        L1.setTipo("Florescente");
        L1.setCor("Branca");
        L1.setTamanho(15);
        L1.setPotencia(10);
        L1.setLigada(true);
        
        L1.ligarLampada();
        
        L1.status();
        
        //Segunda Lâmpada
        Lampada L2=new Lampada();
        L2.setMarca("Luz da Lua");
        L2.setTipo("Luz negra");
        L2.setCor("Preta");
        L2.setTamanho(30);
        L2.setPotencia(30);
        L2.setLigada(false);
        
        L2.desligarLampada();
        
        L2.status();
        
                        
    
        
    }
}
