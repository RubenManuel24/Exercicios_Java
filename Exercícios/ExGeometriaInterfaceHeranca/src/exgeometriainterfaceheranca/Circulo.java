
package exgeometriainterfaceheranca;
public class Circulo extends Figura2D {
//Atributos    
private double raio;
//Metodos especiais

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

//Metodos
    @Override
    public double CalcularArea() {
        
        double a;
        a=Math.PI*Math.pow(raio, 2);
        
        return a;
       
    }

    @Override
    public String toString() {
       String s=super.toString();
              s+="\nRaio: "+this.getRaio();
       return s;
    }
    
    
}
