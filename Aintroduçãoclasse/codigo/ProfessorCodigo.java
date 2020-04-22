package JavaA.Aintroduçãoclasse.codigo;
import JavaA.Aintroduçãoclasse.classes.Professor;

public class ProfessorCodigo {
    public static void main(String[] args) {
        Professor prof = new Professor();
        prof.cpf = "222.222.222-22";
        prof.matricula = "1215";
        prof.nome = "Maria";
        prof.rg = "14114-1";

        Professor prof2 = new Professor();
        prof.cpf = "222.222.222-20";
        prof.matricula = "1225";
        prof.nome = "Mariazinha";
        prof.rg = "14213-1";

        prof = prof2;

        System.out.println(prof.cpf);
        System.out.println(prof.matricula);
        System.out.println(prof.nome);
        System.out.println(prof.rg);
        System.out.println("----------------");
        System.out.println(prof2.nome);
        System.out.println(prof2.rg);
        System.out.println(prof2.matricula);
        System.out.println(prof2.cpf);


    }
}
