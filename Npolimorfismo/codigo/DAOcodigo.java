package JavaA.Npolimorfismo.codigo;

import JavaA.Npolimorfismo.classes.ArquivoDAOImpl;
import JavaA.Npolimorfismo.classes.GenericDAO;

import java.util.LinkedList;
import java.util.List;

public class DAOcodigo {
    public static void main(String[] args) {
        GenericDAO arquivoDAO = new ArquivoDAOImpl();
        arquivoDAO.save();
        List<String> lista = new LinkedList<>();
        lista.add("nome1");
        lista.add("nome2");
        lista.add("nome3");
        lista.add("nome4");
        for(String nome : lista ){
            System.out.println(nome);
        }
    }
}
