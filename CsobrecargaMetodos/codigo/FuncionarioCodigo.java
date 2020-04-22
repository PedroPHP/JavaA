package JavaA.CsobrecargaMetodos.codigo;

import JavaA.CsobrecargaMetodos.classes.Funcionario;

public class FuncionarioCodigo {
    public static void main(String[] args) {
        Funcionario funcionario=new Funcionario("pedro","111.222.333-44",4500,"12323-1");
        Funcionario funcionario2 = new Funcionario();
        //     funcionario.init("pedro","111.222.333-44",4500,"12323-1");
        funcionario.imprime();


    }
}
