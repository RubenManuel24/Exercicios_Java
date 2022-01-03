
package controlador;
public class exercicio { 
    public static void main(String[] args) {
        
        
        ControladorRemoto c1 = new ControladorRemoto();
        
      
       c1.travar();
       c1.buzinar();
       c1.ligarMenu();
       
        System.out.println("\n--------------------------------------\n");
       
        ControladorRemoto c2 = new ControladorRemoto();
        
        c2.ligar();
        c2.acelerar();
        c2.acelerar();
        c2.acelerar();
        c2.acelerar();
        c2.acelerar();
        c2.acelerar();
        c2.acelerar();
        c2.acelerar();
         c2.travar();
        c2.buzinar();
        c2.ligarMenu();
       
        
        
    }
    
}
