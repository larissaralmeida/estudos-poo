package aula10b;

public class Aluno extends Pessoa {
    private int matricula;
    private String curso;

    //Métodos
    public void cancelarMatricula() {
        System.out.println("Matrícula será cancelada!");
    }

    //Métodos especiais

    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
}
