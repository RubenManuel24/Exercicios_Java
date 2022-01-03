
package poo;
public class OConta {
    public static void main(String[] args) {
         
        Conta c1= new Conta();
        
        c1.dono="RUBEN MANUEL";
        c1.numero=191874;
        c1.saldo=1000000;
        c1.especial=true;
        c1.limite=2000000;
        
        
        System.out.println("DONO: "+c1.dono);
        System.out.println("NÚMERO: "+c1.numero);
        System.out.println("SALDO: "+c1.saldo+" Kz");
        System.out.println("ESPECIAL? : "+c1.especial);
        System.out.println("LIMÍTE: "+c1.limite+" Kz");
                
    }
}
