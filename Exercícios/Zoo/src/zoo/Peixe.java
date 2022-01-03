
package zoo;
public final class Peixe extends Animal{
    //Atriutos
    private final String caracteristica= "Barbatana e cauda";
    //Metodos especiais

    public Peixe() {
        this.setNumeroPatas(0);
        this.setAmbiente("Mar");
        this.setCor("Cinzento");
        
    }
       
    
    
    public String getCaracteristica() {
        return caracteristica;
    }

    public void setCaracteristica(String caracteristica) {
        caracteristica = caracteristica;
    }

    @Override
    public String toString() {
       String s = super.toString();
       s+="\n Caracteristicas: "+this.getCaracteristica();
       s+="\n__________________________________________________________________";
       return s;
    }

    
    
    
    
}
