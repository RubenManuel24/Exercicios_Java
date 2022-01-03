
package ultraemojicombate;
public class UltraEmojiCombate {
    public static void main(String[] args) {
        
        Lutador L[] = new Lutador[6];
        
        L[0] = new Lutador("PRETTY BOY",
                            "FRANÇA",
                             31,1.75f,
                             100.9f,11,2,1 );
        
        L[1] = new Lutador("RUDEV",
                            "ANGOLA",
                             23,1.71f,
                             53.2f,6,1,0);
       
        L[2] = new Lutador("PUTSCRIPT",
                            "BRAZIL",
                             29,1.68f,
                             57.8f,14,2,3);
        
        Luta UFC = new Luta();
        
        UFC.marcarLuta(L[2], L[0]);
        UFC.lutar();
        
    }
    
}
 
 