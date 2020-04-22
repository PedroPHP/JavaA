package JavaA.Wio.Codigo;

import java.io.File;
import java.io.IOException;

public class FileDiretorioCodigo {
    public static void main(String[] args) throws IOException {
//        File diretorio = new File("folder");
//        boolean mkdir = diretorio.mkdir();
//        System.out.println("diretorio criado " + mkdir);
//        File arquivo = new File(diretorio,"arquivo.txt");
//        boolean newFile = arquivo.createNewFile();
//        System.out.println("arquivo criado "+ newFile);
//        File arquivoNovoNome = new File(diretorio,"arquivo renomeado.txt");
//        boolean renamed = arquivo.renameTo(arquivoNovoNome);
//        System.out.println("renomeado" +renamed);
//        File diretorioRenomeado = new File("folder2");
//        boolean diretorioRenomeado = diretorio.renameTo("diretorioRenomeado");
//        System.out.println("diretorio renomeado "+diretorioRenomeado);
buscarArquivos();


    }
    public  static void buscarArquivos(){
        File file = new File("folder2");
        String[] list = file.list();
        for(String arquivo : list){
            System.out.println(arquivo);
        }
    }
}
