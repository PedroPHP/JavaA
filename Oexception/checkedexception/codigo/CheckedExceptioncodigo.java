package JavaA.Oexception.checkedexception.codigo;

import java.io.File;
import java.io.IOException;

public class CheckedExceptioncodigo {
    public static void main(String[] args) {
            abrirArquivo();

    }

    public static void criarArquivo() throws IOException {
        File file = new File("teste.txt");
        try{
            System.out.println("arquivo criado? : " +file.createNewFile());
            System.out.println("arquivo criado");
        }catch(IOException e) {
        e.printStackTrace();
        throw e;
        }

    }
    public static void abrirArquivo()  {
        try{
            System.out.println("Abrindo um arquivo ");
            System.out.println("Executando a leitura do arquivo");
//           throw new Exception();
            System.out.println("Escrevendo no arquivo");
        }catch(Exception e) {

            e.printStackTrace();
        }finally {
            System.out.println("Fechar o arquivo");
        }

    }
}
