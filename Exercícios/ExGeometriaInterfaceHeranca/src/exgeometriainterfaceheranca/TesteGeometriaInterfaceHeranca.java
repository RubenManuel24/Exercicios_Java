
package exgeometriainterfaceheranca;
public class TesteGeometriaInterfaceHeranca {
    public static void main(String[] args) {
        System.out.println("\t==============CÁLCULO DE FIGURAS GEOMETRICAS==============");
        Quadrado q1=new Quadrado();
        Circulo c1 = new Circulo();
        Triangulo t1=new Triangulo();
        Cubo cu=new Cubo();
        Cilindro ci1 =new Cilindro();
        
        q1.setCor("Vermelho");
        q1.setNome("Quadrado");
        q1.setLado(6);
        q1.toString();
        System.out.println("A área do Quadrado é de: "+q1.CalcularArea()); 
        
        System.out.println("=========================================");
        
        c1.setNome("Círculo");
        c1.setCor("Verde");
        c1.setRaio(4);
        c1.toString();
        System.out.println("A área do Círculo é de: "+c1.CalcularArea());
        
        System.out.println("=========================================");
        
        t1.setNome("Triângulo");
        t1.setCor("Amarelo");
        t1.setAltura(6);
        t1.setBase(4);   
        t1.toString();
        System.out.println("A área do Triângulo é de: "+t1.toString()); 
        
        System.out.println("=========================================");
       
        cu.setNome("Cúbo");
        cu.setCor("Roxo");
        cu.setArea(20);
        cu.toString();
        System.out.println("A área do Cúbo é de: "+cu.CalcularArea());
        System.out.println("O volume do Cúbo é de: "+ cu.CalcularVolume());
        
        System.out.println("=========================================");
       
        ci1.setNome("Cilíndro");
        ci1.setCor("Azul");
        ci1.setAltura(10);
        ci1.setRaio(4);
        ci1.toString();
        System.out.println("A área Cilindro é de: "+ci1.CalcularArea());
        System.out.println("O volume do Cilindro é de: "+ci1.CalcularVolume());
        
        
        
        
        
       
    }
    
}
