
package exercicioescola;
public final class Bolsista extends Aluno {
    //Atributo
    private int bolsa;
    //Metodos
    public void detalheB(){
        System.out.println("BOLSA: "+this.getBolsa());
        System.out.println(" ");
    
    }
    public void renovarBolsa(){
    
        System.out.println("BOLSA DE ESTUDO DO/A ALUNO/A "+this.getNome()+" FOI RENOVADA");
    
    }
    @Override
    public void pagarMensalidade(){
    
        System.out.println("PAGAMENTO DE MENSALIDADE DO/A UM BOLSEIRO/A "+this.getNome()+" FOI PAGA");
    
    }
    //Metodos especiais

    public int getBolsa() {
        return bolsa;
    }

    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }
    
    
}
