package JavaA.Oexception.checkedexception.clases;

public class LeitorUM implements AutoCloseable {

    @Override
    public void close() throws Exception {
        System.out.println("Fechando leitor 1");

    }
}
