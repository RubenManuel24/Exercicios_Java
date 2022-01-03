
package exgeometriainterfaceheranca;
public class Quadrado extends Figura2D{
//Atributo
private double lado;
//Metodos especiais
    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
//Metodos
    @Override
    public double CalcularArea() {
        
        double a;
        a=Math.pow(lado, 2);
        return a;
    }

    @Override
    public String toString() {
        String s=super.toString();
               s+="\nValor dos Lados: "+this.getLado();
               
        return s;
    }
    
}
