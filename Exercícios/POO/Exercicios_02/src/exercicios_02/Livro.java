
package exercicios_02;
public class Livro implements Publicacao {
    
     //Atributos
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;
    
    // Metodo
    
    public void detalhes(){
        
        System.out.println("O TÍTULO DO LIVRO: "+this.getTitulo());
        System.out.println("AUTOR: "+this.getAutor());
        System.out.println("TOTAL DE PÁGINAS : "+this.getTotPaginas());
        System.out.println("PÁGINA ATUAL : "+this.getPagAtual());
        System.out.println("O LÍVRO ESTÁ ABERTO? :"+this.getAberto());
        System.out.println("O LEITOR É : "+this.leitor.getNome()+ " DE SEXO: "+this.leitor.getSexo()+ " E "+this.leitor.getIdade()+" ANOS DE IDADE"); 
    }
    
    // Metodos especiais

    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.pagAtual=0;
        this.aberto=false;
        this.totPaginas = totPaginas;
        this.leitor = leitor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String a) {
        this.titulo = a;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String b) {
        this.autor = b;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int c) {
        this.totPaginas = c;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int d) {
        this.pagAtual = d;
    }

    public boolean getAberto() {
        return aberto;
    }

    public void setAberto(boolean e) {
        this.aberto = e;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa f) {
        this.leitor = f;
    }
    
    // Metodos de interface

    @Override
    public void abrir() {
        if(this.getAberto()==false){
        
         this.setAberto(true);
        }
        
        else{  System.out.println("O LIVRO "+this.titulo+ "JÁ ESTÁ ABERTO");
        
        }  
    }

    @Override
    public void fechar() {
        
        if(this.getAberto()==true){
        
            this.setAberto(false);
            this.setPagAtual(0);
        }   
    }

    @Override
    public void folhar(int a) {
        if(this.getTotPaginas()>this.getPagAtual()){
        
        this.setPagAtual(a);
        }
      
    
        }
    
     
    

    @Override
    public void avançarPag() {
        
        this.setPagAtual(this.getPagAtual()+1);
    }

    @Override
    public void voltarPag() {
        
        this.setPagAtual(this.getPagAtual()-1);
    }
    
    
    
}
