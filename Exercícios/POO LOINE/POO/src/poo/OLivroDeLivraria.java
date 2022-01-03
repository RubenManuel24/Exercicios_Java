
package poo;
public class OLivroDeLivraria {
    public static void main(String[] args) {
        LivroDeLivraria Lv = new LivroDeLivraria();
        
         Lv.titulo="UM PROGRAMADOR APAIXONADO";
        Lv.autor="RUBEN MANUEL";
        Lv.genero="CIENTIFICO";
        Lv.edicoa=1;
        Lv.editora="ANGOEDITORA";
        Lv.anoLancamento="22-09-2021";
        Lv.numeroPagina=100;
        Lv.preco=15000;
        
        
       System.out.println("TÍTULO: "+Lv.titulo);
        System.out.println("AUTOR: "+Lv.autor);
        System.out.println("GENERO: "+Lv.genero);
        System.out.println("EDIÇÃO: "+Lv.edicoa);
        System.out.println("EDITORA: "+Lv.editora);
        System.out.println("ANO DE LANÇAMENTO: "+Lv.anoLancamento);
        System.out.println("NÚMERO DE PÁGINAS: "+Lv.numeroPagina);
        System.out.println("PREÇO:: "+Lv.preco+ " Kz");
        
    }
            
}
