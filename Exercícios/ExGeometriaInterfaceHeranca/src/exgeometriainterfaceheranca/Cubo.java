
package exgeometriainterfaceheranca;
public class Cubo extends Figura3D{
//Atributo
private double area;
//Metodos especiais
    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
//Metodos
    @Override
    public double CalcularArea() {
        
        double a;
        a=6*Math.pow(area, 2);
        return a;
        
    }

    @Override
    public double CalcularVolume() {
        
        double a;
        a=Math.pow(area, 3);
        return a;
    }

    @Override
    public String toString() {
        String s=super.toString();
               s+="\nÁrea: "+this.getArea();
             
        return s;
    }
    
}
