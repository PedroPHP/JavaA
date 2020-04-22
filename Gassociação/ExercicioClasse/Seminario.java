package JavaA.Gassociação.ExercicioClasse;

public class Seminario {
    private String titulo;
    private Aluno[] aluno;
    private Professor professor;
    private Local local;

    public Seminario() {
    }
    public void print(){
        System.out.println("---------Relatorio do semiario---------");
        System.out.println("titulo: "+this.titulo);
        System.out.println("Professor palestrante  "+this.professor.getNome());
        if(this.professor != null)
            System.out.println("professor " + this.professor.getNome());
        else
            System.out.println("nunhum professor cadastrado para esse seminario");

        if(this.local != null)
            System.out.println("local, rua: " + this.local.getRua()+ "Bairro: "+this.local.getBairro());
        else
            System.out.println("nunhum local cadastrado para esse seminario");
        if (aluno !=null && aluno.length != 0) {
            System.out.println("alunos participantes ");
            for (Aluno aluno : aluno) {
                System.out.println(aluno.getNome());
            }
            return;
        }
        System.out.println("nenhum aluno cadastrado");
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    public JavaA.Gassociação.ExercicioClasse.Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Aluno[] getAluno() {
        return aluno;
    }

    public void setAluno(Aluno[] aluno) {
        this.aluno = aluno;
    }

    public String getTitulo() {
        return titulo;
    }

}
