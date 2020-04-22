package JavaA.Npolimorfismo.codigo;

import JavaA.Npolimorfismo.classes.Funcionario;
import JavaA.Npolimorfismo.classes.Gerente;
import JavaA.Npolimorfismo.classes.RelatorioPagamento;
import JavaA.Npolimorfismo.classes.Vendedor;

public class PolimorfismoCodigo {
    public static void main(String[] args) {
        Gerente g = new Gerente("Oswaldo", 5000, 2000) {
            @Override
            public void calacularPagamento() {

            }
        };
        Vendedor v = new Vendedor("Yuri", 2000, 20000) {
            @Override
            public void calcularPagamento() {

            }
        };
        RelatorioPagamento relatorio =  new RelatorioPagamento();
//        relatorio.relatorioPagamentoGerente(g);
//        System.out.println("---------------------------");
//        relatorio.relatorioPagamentoVendedor(v);
        relatorio.relatorioPagamentoGenerico(g);
        System.out.println("---------------------------");
        relatorio.relatorioPagamentoGenerico(v);

    }
}
