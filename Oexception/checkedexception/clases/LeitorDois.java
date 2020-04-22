package JavaA.Oexception.checkedexception.clases;

public class LeitorDois implements AutoCloseable {
    @Override
    public void close() throws Exception {
        System.out.println("fechando leitor dois");
    }
}
