
package poo;
public class OLivro {
    public static void main(String[] args) {
        Livro L=new Livro();
        
        L.titulo="UM PROGRAMADOR APAIXONADO";
        L.autor="RUBEN MANUEL";
        L.genero="CIENTIFICO";
        L.edicoa=1;
        L.editora="ANGOEDITORA";
        L.anoLancamento="22-09-2021";
        L.numeroPagina=100;
        
       System.out.println("TÍTULO: "+L.titulo);
        System.out.println("AUTOR: "+L.autor);
        System.out.println("GENERO: "+L.genero);
        System.out.println("EDIÇÃO: "+L.edicoa);
        System.out.println("EDITORA: "+L.editora);
        System.out.println("ANO DE LANÇAMENTO: "+L.anoLancamento);
        System.out.println("NÚMERO DE PÁGINAS: "+L.numeroPagina);
        
        System.out.println("=========================================");
        
        Livro L2 = new Livro();
        
        L2.titulo="AS COISAS LNDAS DO MUNDO";
        L2.autor="DÁDIVA MANUEL";
        L2.genero="AUTO AJUDA";
        L2.edicoa=1;
        L2.editora="ANGOEDITORA";
        L2.anoLancamento="22-09-2021";
        L2.numeroPagina=50;
        
        System.out.println("TÍTULO: "+L2.titulo);
        System.out.println("AUTOR: "+L2.autor);
        System.out.println("GENERO: "+L2.genero);
        System.out.println("EDIÇÃO: "+L2.edicoa);
        System.out.println("EDITORA: "+L2.editora);
        System.out.println("ANO DE LANÇAMENTO: "+L2.anoLancamento);
        System.out.println("NÚMERO DE PÁGINAS: "+L2.numeroPagina);
    }
}
