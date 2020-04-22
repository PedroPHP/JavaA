package JavaA.Wio.Codigo;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileCodigo {
    public static void main(String[] args) {
        File file = new File("Arquivo.txt");
        try {
            System.out.println(file.createNewFile());
            boolean exists = file.exists();
            System.out.println("permisao de leitura? "+file.canRead());
            System.out.println("path "+file.getPath());
            System.out.println("path "+file.getAbsolutePath());
            System.out.println("Directory "+file.isDirectory());
            System.out.println("Hidden "+file.isHidden());
            System.out.println("lastModified "+new Date(file.lastModified()));
            if(exists){
                System.out.println("deletado ? "+file.delete());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
