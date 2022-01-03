
package zoo;
public final class Mamifero extends Animal {
    //Atributos
    private String alimento;
    //Metodos especiais

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    @Override
    public String toString() {
      String s = super.toString();
      s+= "\n Alimento: "+this.getAlimento();
      s+= "\n__________________________________________________________________";
      return s;
    }
    
}
