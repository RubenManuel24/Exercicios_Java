
package exercicioescola;
public final class Tecnico extends Aluno{
    private int registoProfissional;
    
    public void praticar(){
     
        System.out.println("O ALUNO "+this.getNome()+" ESTÁ NA AULA PRÁTICA");
        System.out.println("\n\n");
    }

    public int getRegistoProfissional() {
        return registoProfissional;
    }
    public void detalheT(){
    
        System.out.println("REGISTO PROFISSIONAL: "+this.getRegistoProfissional());
    }

    public void setRegistoProfissional(int registoProfissional) {
        this.registoProfissional = registoProfissional;
    }
    
}
