package JavaA.Gassociação.ExercicioClasse;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminario;

    public Professor() {
    }

    public void print() {
        System.out.println("---------Relatorio do semiario---------");
        System.out.println("nome: " + this.nome);
        System.out.println("especialidade: " + this.especialidade);
        if (seminario != null && seminario.length != 0) {
            System.out.println("seminario participantes ");
            for (Seminario sem : seminario) {
                System.out.println(sem.getTitulo() + " ");
            }
            return;

        }
        System.out.println("Professor nao vinculado a nem um seminario");
    }

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario[] seminario) {
        this.seminario = seminario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
