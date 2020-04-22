package JavaA.Isobrescrita.codigo;

import JavaA.Isobrescrita.classes.Pessoa;

public class PessoaCodigo {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.setNome("pedo");
        p.setIdade(300);
        System.out.println(p);
        Pessoa p2 = new Pessoa();
        p2.setNome("ped");
        p2.setIdade(200);
        System.out.println(p2);
    }
}
