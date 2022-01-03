
package class_object;

import java.util.Arrays;
import java.util.Objects;

public class Aluno{
    
    //Atributos
   
    private String curso;
   
    private double[] notas;
   
    //Métoods especiaias

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }
    
    //Metodos
    
    public int calcularMedia(){
     return 0;
    }
    
    public boolean verificarAprovado(){
     return true;
    }
    
    
    
    public void apresentarNota(){
    
        for(int cont=0; cont<notas.length; cont++){
        System.out.println("AS NOTAS SÃO: "+notas[cont]);
        }
    
    }

    @Override
    public String toString() {
        return "Aluno{" + "curso=" + curso + ", notas=" + Arrays.toString(notas) + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Aluno other = (Aluno) obj;
        if (!Objects.equals(this.curso, other.curso)) {
            return false;
        }
        if (!Arrays.equals(this.notas, other.notas)) {
            return false;
        }
        return true;
    }

    
    
    
    
 }
