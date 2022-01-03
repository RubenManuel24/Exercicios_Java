
package pessoaescola;
public class Bolsista extends Aluno {
    //Atributo
    private int bolsa;
   //Metodo
    
    public void detalheB(){
        
        System.out.println("BOLSA: "+this.getBolsa());
        System.out.println("====================================");
    
    }
    
    public void renovarBolsa(){
        
        System.out.println("RENOVANDO BOLSA DO/A "+this.nome);
    
    }
    @Override
    public void pagarMensalidade(){
        
        System.out.println(this.nome+ " É BOLSISTA! PAGAMENTO FACILIDADO");
    }
   //Metodo Especial

    public int getBolsa() {
        return bolsa;
    }

    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }
    
}
