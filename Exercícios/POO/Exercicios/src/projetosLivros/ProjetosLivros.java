
package projetosLivros;
public class ProjetosLivros {
    public static void main(String[] args) {
        
        Pessoa P[] = new Pessoa[2];
        Livro L[] = new Livro[2];
        
        P[0]= new Pessoa("RUBEM",24,'M');
        P[1]= new Pessoa("SÍLVIA", 21, 'F');
        
        L[0]= new Livro("UM PROGRAMADOR APAIXONADO", "GUSTAVO ANDRÉ", 100,P[0]);
        L[1]=new Livro("A CULPA É DAS ESTRELAS", "MATEUS PAUL", 100,P[1]);
        
        L[0].abrir();
        L[0].folhar(80);
        L[0].avançarPagina();
        
         L[1].abrir();
         L[1].avançarPagina();
        
        System.out.println(L[0].detalhes()); 
        System.out.println(L[1].detalhes());
       
    }
    
}
