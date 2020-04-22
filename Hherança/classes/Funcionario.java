package JavaA.Hherança.classes;

public class Funcionario extends Pessoa {
    private double salario;
    {
        System.out.println("bloco de inicialização de funcionario 1");
    }
    {
        System.out.println("bloco de inicialização de funcionario 2");
    }
    public Funcionario(String nome) {
        super(nome);
        System.out.println("dentro do construtor de funcionario");
    }

    public void imprime(){
        super.imprime();
        System.out.println("salario: "+this.salario);
        imprimeReciboPagamento();
    }
 public void imprimeReciboPagamento(){
     System.out.println("eu "+super.nome+"recebi o pagamento de  "+this.salario);
 }


    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
