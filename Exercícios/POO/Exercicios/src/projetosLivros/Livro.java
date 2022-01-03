
package projetosLivros;
public class Livro implements Publicacao  {
    
    //Atributos
    
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagActual;
    private boolean aberto;
    private Pessoa leitor;
    
    // Metodos

    
    public String detalhes() {
         System.out.println("=======================================");
        return "Livro{" + "titulo=" + titulo + "\n, autor="
                + autor + "\n, totPaginas=" + totPaginas
                + "\n, pagActual=" + pagActual + "\n, aberto="
                + aberto + "\n, leitor=" + leitor.getNome()+ 
                ", idade=" + leitor.getIdade()+ '}';
       
    }
    
   
    
    // Metodos especiais

    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.aberto=false;
        this.pagActual=0;
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

    public int getPagActual() {
        return pagActual;
    }

    public void setPagActual(int d) {
        this.pagActual = d;
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
    
    //Interface

    @Override
    public void abrir() {
        
        if(this.getAberto()==false){
            
        this.setAberto(true);
        
        }
        
        else{
        
            System.out.println("O LIVRO JÁ ESTÁ ABERTO");
        }
        
        
    }

    @Override
    public void fechar() {
        
        if(this.getAberto()==true){
        
        this.setAberto(false);
        }
        else{
        
            System.out.println("O LIVRO JÁ ESTA FECHADO");
        
        }
    }

    @Override
    public void folhar(int p) {
       this.pagActual=p;
    }

    @Override
    public void avançarPagina() {
        if(this.getAberto()==true){
        
        this.setPagActual(this.getPagActual()+1);
        
        }
        
        else{
        
            System.out.println("IMPOSSÍVEL AVANÇAR DE PÁGINA PORQUE O LIVRO "+this.getTitulo()+ "ESTÁ FECHADO");
            System.out.println("=================================================");
        }
        
    }

    @Override
    public void voltarPagina() {
        if(this.getAberto()==true){
            
        this.setPagActual(this.getPagActual()-1);
        
        }
        
        else{
        
            System.out.println("IMPOSSÍVEL VOLTAR DE PÁGINA PORQUE O LIVRO ESTÁ FECHADO");
            System.out.println("=================================================");
        
        }
    }
    
    
}
