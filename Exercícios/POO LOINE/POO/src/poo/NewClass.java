
package poo;
public class NewClass {
    public static void main(String[] args) {
        Lampada L1 = new Lampada();
        
        L1.marca="Light Power";
        L1.tipo="Florescente";
        L1.tamanho=5.5;
        L1.consumoEnergia=5;
        L1.DataFabrico="22-09-2021";
        L1.DataExpiracoa="22-09-23";
        L1.custo=100;
        
        
        System.out.println("MARCA: "+L1.marca);
        System.out.println("TIPO: "+L1.tipo);
        System.out.println("TAMANHO: "+L1.tamanho+" cm");
        System.out.println("CONSUMO DE ENERGIA: "+L1.consumoEnergia+" V");
        System.out.println("DATA DE FABRICO: "+L1.DataFabrico);
        System.out.println("DATA DE EXPIRAÇÃO: "+L1.DataExpiracoa);
        System.out.println("PREÇO: "+L1.custo+" kz");
    }
}
