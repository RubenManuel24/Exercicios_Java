
package class_object;
public class ClassObject {
    public static void main(String[] args) {
        
        Aluno A1 = new Aluno();
        
        A1.setCurso("Ciência da computação");
        
        double[] notas ={12,10,15,20}; 
       
        A1.setNotas(notas);
        System.out.println(A1.getCurso());
       //A1.apresentarNota();
        System.out.println(A1.toString());
    }
    
}
