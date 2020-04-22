package JavaA.Gassociação.codigo;

import JavaA.Gassociação.ExercicioClasse.Aluno;
import JavaA.Gassociação.ExercicioClasse.Local;
import JavaA.Gassociação.ExercicioClasse.Professor;
import JavaA.Gassociação.ExercicioClasse.Seminario;

public class AssociaçãoCodigo {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("pedro",20);
        Aluno aluno2 = new Aluno("dark",20);

        Seminario sem= new Seminario("como ser programador");
        Professor prof = new Professor("yoda", "usar a força para programa");
        Local local = new Local("rua das palmeiras", "mato");

        aluno.setSeminario(sem);
        aluno2.setSeminario(sem);

        aluno.print();
        sem.setProfessor(prof);
        sem.setLocal(local);
        sem.setAluno(new Aluno[]{aluno, aluno2});

        Seminario[] semArrey = new Seminario[1];
        semArrey[0] = sem;
        prof.setSeminario(semArrey);

        sem.print();
        prof.print();
    }
}
