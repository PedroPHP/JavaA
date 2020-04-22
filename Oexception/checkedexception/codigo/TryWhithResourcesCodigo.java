package JavaA.Oexception.checkedexception.codigo;

import JavaA.Oexception.checkedexception.clases.LeitorDois;
import JavaA.Oexception.checkedexception.clases.LeitorUM;

import java.io.*;

public class TryWhithResourcesCodigo {
    public static void main(String[] args) {
    lerAqrquivo();
    }

    public static void lerAqrquivo() {
        try (LeitorUM leitor1 = new LeitorUM();
             LeitorDois leitor2 = new LeitorDois()) {
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void lerAqrquivoold() {
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("text.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
