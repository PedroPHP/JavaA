package JavaA.Wio.Codigo;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterReaderCodigo {
    public static void main(String[] args) {
        File file = new File("Arquivo.txt");
        try (FileWriter fw = new FileWriter(file,true)){
            FileReader fr = new FileReader(file);
            fw.write("escrevendo no aquivo\n pulando uma linha");
            fw.flush();


            char[]in = new char[500];
            int size =fr.read(in);
            System.out.println("tamanho "+size);
            for(char c: in){
                System.out.println(c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
//        try {
//            FileWriter fw = new FileWriter(file,true);
//            fw.write("escrevendo no aquivo\n pulando uma linha");
//            fw.flush();
//            fw.close();
//
//            FileReader fr = new FileReader(file);
//            char[]in = new char[500];
//            int size =fr.read(in);
//            System.out.println("tamanho "+size);
//            for(char c: in){
//                System.out.println(c);
//            }
//            fr.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}
