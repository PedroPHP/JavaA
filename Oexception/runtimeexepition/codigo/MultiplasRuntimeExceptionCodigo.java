package JavaA.Oexception.runtimeexepition.codigo;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class MultiplasRuntimeExceptionCodigo {
    public static void main(String[] args) {
        try {
            throw new ArrayIndexOutOfBoundsException();
        } catch (IllegalArgumentException | ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("dentro do programa");
        }
        System.out.println("finaldo programa");

        try {
            talvezLanceException();
        } catch (Exception e) {

        }

    }

    private static void talvezLanceException() throws SQLException, FileNotFoundException {

    }
}
