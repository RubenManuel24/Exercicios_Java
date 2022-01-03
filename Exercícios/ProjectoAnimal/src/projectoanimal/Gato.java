
package projectoanimal;
public final class Gato extends Mamifero  {
    
    //Atributos
    private String raça;
    
    //Metodos especiais

    public final String getRaça() {
        return raça;
    }

    public void setRaça(String raça) {
        this.raça = raça;
    }

    @Override
    public void amamentar() {
        System.out.println("AMAMENTA DE LEITE");
    }

    @Override
    public void EmitirSom() {
        System.out.println("MIAU MIAU MIAU");
    }
    
    
}
