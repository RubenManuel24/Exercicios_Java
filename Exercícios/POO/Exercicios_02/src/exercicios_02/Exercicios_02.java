
package exercicios_02;
public class Exercicios_02 {  
    public static void main(String[] args) {
        
        Pessoa p[]= new Pessoa[2];
        Livro L[]= new Livro[2];
        
        p[0] = new Pessoa("Rubem Manuel",23,"M");
        L[0]= new Livro("SEJA FODA","PAULO VICTOR",50,p[0]);
        
        L[0].abrir();
        L[0].folhar(200);
        
        
        p[0].fazerAniversário();
        
        
        
        
        
        L[0].detalhes();
        
    }
    
}
