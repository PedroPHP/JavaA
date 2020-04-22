package JavaA.Lclassesabstratas.codigo;

import JavaA.Lclassesabstratas.classes.Funcionario;
import JavaA.Lclassesabstratas.classes.Gerente;
import JavaA.Lclassesabstratas.classes.Vendedor;

public class FuncionarioCodigo {
    public static void main(String[] args) {

        Gerente g = new Gerente("pana","23221",2000);
        Vendedor v = new Vendedor("camila", "32323", 1500, 5000);
        g.calculaSalario();
        v.calculaSalario();
        System.out.println(g);
        System.out.println("---------");
        System.out.println(v);

    }
}
