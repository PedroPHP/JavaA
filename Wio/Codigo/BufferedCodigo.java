package JavaA.Wio.Codigo;

import java.io.*;

public class BufferedCodigo {
    public static void main(String[] args) {
        File file = new File("Arquivo.txt");
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            BufferedReader br = new BufferedReader(new FileReader(file));) {
            bw.write("escrevendo no aquivo");
            bw.newLine();
            bw.write("e pulando linha");
            bw.flush();
            String s;
            while((s=br.readLine())!=null){
                System.out.println(s);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }

//        try {
//            FileWriter fw = new FileWriter(file,true);
//            BufferedWriter bw = new BufferedWriter(fw);
//            bw.write("escrevendo no aquivo");
//            bw.newLine();
//            bw.write("e pulando linha");
//            bw.flush();
//            bw.close();
//
//            FileReader fr = new FileReader(file);
//            BufferedReader br = new BufferedReader(fr);
//            String s = null;
//            while((s=br.readLine())!=null){
//                System.out.println(s);
//            }
//            br.close();
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}
