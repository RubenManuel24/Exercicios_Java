
package exgeometriainterfaceheranca;
public class Cilindro extends Figura3D{
//Atributo
private double raio;
private double altura;
//Metodos especiais
    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
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
        a=Math.PI*Math.pow(raio, 2)*altura;
        return a;
        
    }

    @Override
    public double CalcularVolume() {
        
        double a;
        a=2*Math.PI*raio*(altura+raio);
        return a;
    }

    @Override
    public String toString() {
        String s=super.toString();
               s+="\nRaio: "+this.getRaio();
               s+="\nAltura: "+this.getNome();
             
        return s;
    }
    
}
