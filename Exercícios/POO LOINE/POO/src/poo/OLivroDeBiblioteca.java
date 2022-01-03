
package poo;
public class OLivroDeBiblioteca {
    public static void main(String[] args) {
        LivroDeBiblioteca Lb = new LivroDeBiblioteca();
        
        Lb.titulo="O CAÇADOR DA LUA";
        Lb.autor="RUBEN MANUEL";
        Lb.genero="AVENTURA";
        Lb.edicao=1;
        Lb.editora="ANGOEDITORA";
        Lb.anoLancamento="O1-09-2021";
        Lb.ultimoEmprestimo="20-09-2021 -- JOÃO EBO";
        
        System.out.println("TÍTULO: "+Lb.titulo);
        System.out.println("AUTOR: "+Lb.autor);
        System.out.println("GENERO: "+Lb.genero);
        System.out.println("EDIÇÃO: "+Lb.edicao);
        System.out.println("EDITORA: "+Lb.editora);
        System.out.println("ANO DO LANÇAMENTO: "+Lb.anoLancamento);
        System.out.println("ÚLTIMO EMPRESTIMO: "+Lb.ultimoEmprestimo);
                
    }
            
}
