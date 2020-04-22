package JavaA.Hherança.codigos;

import JavaA.Hherança.classes.Endereco;
import JavaA.Hherança.classes.Funcionario;
import JavaA.Hherança.classes.Pessoa;

public class HenrançaCodigo {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("gina");
        Endereco end = new Endereco();
        Funcionario f = new Funcionario("augusto");
        p.setCpf("123");
        end.setBairro("2");
        end.setRua("Rua 25");
        p.setEndereco(end);
        f.setCpf("1234");
        f.setSalario(1234);
        f.setEndereco(end);
        p.imprime();
        System.out.println("--------------------");
        f.imprime();

    }
}
