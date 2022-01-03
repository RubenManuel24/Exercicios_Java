
package exgeometriainterfaceheranca;
public class Triangulo extends Figura2D{
//Atributos  
private double base;
private double altura;
//Meetodos especiais
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
//Metodos
    @Override
    public double CalcularArea() {
        
        double a;
        a=(base*altura)/2;
        return a;
        
    }

    @Override
    public String toString() {
        String s=super.toString();
               s+="\nBase: "+this.getBase();
               s+="\nAltura: "+this.getAltura();
        return s;
    }
    
}
