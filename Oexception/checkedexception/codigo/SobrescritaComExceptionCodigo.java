package JavaA.Oexception.checkedexception.codigo;

import JavaA.Oexception.checkedexception.clases.Funcionario;
import JavaA.Oexception.checkedexception.clases.Pessoa;
import JavaA.Oexception.customexception.LoginInvalidoException;

public class SobrescritaComExceptionCodigo {
    public static void main(String[] args) {
        Funcionario f = new Funcionario();
        Pessoa p = new Pessoa();

        try {
            f.salvar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }
}
