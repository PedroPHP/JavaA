package JavaA.Kenum.codigo;

import JavaA.Kenum.classes.Cliente;
import JavaA.Kenum.classes.TipoCliente;

public class ClienteCodigo {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("pedo", TipoCliente.PESSOA_FISICA, Cliente.TipoPagamento.APRAZO);
        System.out.println(TipoCliente.PESSOA_JURIDICA.getId());
        System.out.println(TipoCliente.PESSOA_FISICA.getId());
        System.out.println(cliente);
    }
}
